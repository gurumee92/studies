import { Module } from '@nestjs/common';
import { MoviesModule } from './movies/movies.module';

@Module({
  imports: [MoviesModule],
  providers: [],
  controllers: [],
})
export class AppModule {}
