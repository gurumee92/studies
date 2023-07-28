import { Injectable, NotFoundException } from '@nestjs/common';
import { Movie } from './movies.entities';
import {CreateMovieDto, UpdateMovieDto} from './movies.dtos';

@Injectable()
export class MoviesService {
  private movies: Movie[] = [];

  getAll(): Movie[] {
    return this.movies;
  }

  getOne(id: number): Movie {
    const movie = this.movies.find((movie) => movie.id === id);
    if (!movie) {
      throw new NotFoundException(`Movie with ID ${id} not found.`);
    }
    return movie;
  }

  remove(id: number) {
    this.getOne(id);
    this.movies = this.movies.filter((movie) => movie.id !== id);
  }

  update(id: number, movieData: UpdateMovieDto) {
    const movie = this.getOne(id);
    this.remove(id);
    this.movies.push({ ...movie, ...movieData });
  }

  create(movieData: CreateMovieDto) {
    this.movies.push({
      id: this.movies.length + 1,
      ...movieData,
    });
  }
}
