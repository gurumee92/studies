import { Body, Controller, Delete, Get, NotFoundException, Param, Patch, Post, Query } from '@nestjs/common';
import { MoviesService } from './movies.service';
import { Movie } from './entities/movies.entity';

@Controller('movies')
export class MoviesController {
    constructor(private readonly moviesService: MoviesService) {}

    @Post()
    create(@Body() movieData) {
        return this.moviesService.create(movieData);
    }
    
    @Get()
    getAll(): Movie[] {
        return this.moviesService.getAll();
    }

    @Get("search")
    search(@Query("year") year: string){
        return `we are searching for a movies filterd by title: ${year}`;
    }
    
    @Get("/:id")
    getOne(@Param("id") id: string): Movie{
        const movie = this.moviesService.getOne(id);
        if (!movie) {
            throw new NotFoundException(`Movie with ID: ${id} not found.`);
        }
        return movie;
    }
    
    @Delete("/:id")
    remove(@Param("id") id: string) {
        return `this will remove a movie id: ${id}`;
    }

    @Patch("/:id")
    update(@Param("id") id: string, @Body() updateData) {
        return {
            updatedMovie: id,
            ...updateData
        };
    }
}
