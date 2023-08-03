import { Test, TestingModule } from '@nestjs/testing';
import { INestApplication, ValidationPipe } from '@nestjs/common';
import * as request from 'supertest';
import { AppModule } from '../src/app.module';

describe('AppController (e2e)', () => {
  let app: INestApplication;

  beforeAll(async () => {
    const moduleFixture: TestingModule = await Test.createTestingModule({
      imports: [AppModule],
    }).compile();

    app = moduleFixture.createNestApplication();
    app.useGlobalPipes(
      new ValidationPipe({
        whitelist: true,
        forbidNonWhitelisted: true,
        transform: true,
      }),
    );
    await app.init();
  });

  it('/ (GET)', () => {
    return request(app.getHttpServer())
      .get('/')
      .expect(200)
      .expect('nestjs movies api');
  });

  describe('/movies', () => {
    it('GET', () => {
      return request(app.getHttpServer()).get('/movies').expect(200).expect([]);
    });

    it('POST 201', () => {
      return request(app.getHttpServer())
        .post('/movies')
        .send({
          title: 'test',
          year: 2023,
          genres: ['romantic'],
        })
        .expect(201);
    });

    it('POST 400 empty request', () => {
      return request(app.getHttpServer()).post('/movies').send({}).expect(400);
    });

    it('POST 400 too many request', () => {
      return request(app.getHttpServer())
        .post('/movies')
        .send({
          title: 'test',
          year: 2023,
          genres: ['romantic'],
          other: 'THIS IS FUCKING REQUEST',
        })
        .expect(400);
    });

    it('POST 400 request is not validate', () => {
      return request(app.getHttpServer())
        .post('/movies')
        .send({
          title: 200,
          year: 2023,
          genres: ['romantic'],
        })
        .expect(400);
    });
  });

  describe('/movies/:id', () => {
    it('GET 200', () => {
      return request(app.getHttpServer()).get('/movies/1').expect(200);
    });
    it('GET 404', () => {
      return request(app.getHttpServer()).get('/movies/999').expect(404);
    });
    it('PATCH 200', () => {
      return request(app.getHttpServer())
        .patch('/movies/1')
        .send({
          title: 'TEST',
        })
        .expect(200);
    });
    it('PATCH 404', () => {
      return request(app.getHttpServer())
        .patch('/movies/999')
        .send({
          title: 'TEST',
        })
        .expect(404);
    });
    it('PATCH 400 invalid request', () => {
      return request(app.getHttpServer())
        .patch('/movies/1')
        .send({
          title: 1,
        })
        .expect(400);
    });
    it('PATCH 400 too many request', () => {
      return request(app.getHttpServer())
        .patch('/movies/1')
        .send({
          title: 1,
          other: 'THIS IS FUCKING REQUEST',
        })
        .expect(400);
    });
    it('DELETE 200', () => {
      return request(app.getHttpServer()).delete('/movies/1').expect(200);
    });
    it('DELETE 404', () => {
      return request(app.getHttpServer()).delete('/movies/1').expect(404);
    });
  });
});
