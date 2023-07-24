import { Injectable } from '@nestjs/common';
import { Movie } from './entities/movies.entity';

@Injectable()
export class MoviesService {
    private movies: Movie[] = [];

    getAll(): Movie[] {
        return this.movies;
    }

    getOne(id: string): Movie{
        return this.movies.find(movie => movie.id === +id);
    }

    remove(id: string) {
        this.getOne(id);
        this.movies.filter(movie => movie.id !== +id);
    }

    create(movieData) {
        this.movies.push({
            id: this.movies.length + 1,
            ...movieData
        });
    }
}
