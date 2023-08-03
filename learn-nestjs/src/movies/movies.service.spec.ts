import { MoviesService } from './movies.service';
import { Test, TestingModule } from '@nestjs/testing';
import { Movie } from './movies.entities';
import { NotFoundException } from '@nestjs/common';

describe('MoviesService', () => {
  let service: MoviesService;

  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      providers: [MoviesService],
    }).compile();

    service = module.get<MoviesService>(MoviesService);
  });

  it('should be defined', () => {
    expect(service).toBeDefined();
  });

  describe('getAll', () => {
    it('should be array', () => {
      const movies = service.getAll();
      expect(movies).toBeInstanceOf(Array<Movie>);
      expect(movies.length).toEqual(0);
    });
  });

  describe('getOne', () => {
    it('should be return movie', () => {
      service.create({
        title: 'test',
        year: 2022,
        genres: ['romance'],
      });
      const movie: Movie = service.getOne(1);
      expect(movie.title).toEqual('test');
      expect(movie.year).toEqual(2022);
      expect(movie.genres).toBeInstanceOf(Array<string>);
      expect(movie.genres.length).toEqual(1);
      expect(movie.genres[0]).toEqual('romance');
    });

    it('should throw 404 error', () => {
      try {
        service.getOne(99999);
      } catch (e) {
        expect(e).toBeInstanceOf(NotFoundException);
        expect(e.message).toEqual('Movie with ID 99999 not found.');
      }
    });
  });

  describe('create', () => {
    it('should movie length +1 after create', () => {
      const before = service.getAll().length;
      service.create({
        title: 'test',
        year: 2022,
        genres: ['romance'],
      });
      const after = service.getAll().length;
      expect(after).toBeGreaterThan(before);
    });
  });

  describe('remove', () => {
    it('delete movie', () => {
      service.create({
        title: 'test',
        year: 2022,
        genres: ['romance'],
      });
      const before = service.getAll().length;
      service.remove(1);
      const after = service.getAll().length;
      expect(after).toBeLessThan(before);
    });

    it('should return 404', () => {
      try {
        service.remove(99999);
      } catch (e) {
        expect(e).toBeInstanceOf(NotFoundException);
        expect(e.message).toEqual('Movie with ID 99999 not found.');
      }
    });
  });

  describe('update', () => {
    it('should be update a movie', () => {
      service.create({
        title: 'test',
        year: 2022,
        genres: ['romance'],
      });
      service.update(1, {
        title: 'updated test',
        year: 2023,
      });
      const movie = service.getOne(1);
      expect(movie.title).toEqual('updated test');
      expect(movie.year).toEqual(2023);
    });

    it('should be return 404', () => {
      try {
        service.update(99999, {
          title: 'test',
        });
      } catch (e) {
        expect(e).toBeInstanceOf(NotFoundException);
        expect(e.message).toEqual('Movie with ID 99999 not found.');
      }
    });
  });
});
