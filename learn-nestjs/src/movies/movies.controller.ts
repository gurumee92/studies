import {
  Body,
  Controller,
  Delete,
  Get,
  Param,
  Patch,
  Post,
} from '@nestjs/common';
import { MoviesService } from './movies.service';
import { Movie } from './movies.entities';
import { CreateMovieDto, UpdateMovieDto } from './movies.dtos';

@Controller('movies')
export class MoviesController {
  constructor(private readonly moviesService: MoviesService) {}

  @Post()
  create(@Body() movieDto: CreateMovieDto) {
    return this.moviesService.create(movieDto);
  }

  @Get()
  getAll(): Movie[] {
    return this.moviesService.getAll();
  }

  @Get('/:id')
  getOne(@Param('id') id: number): Movie {
    return this.moviesService.getOne(id);
  }

  @Delete('/:id')
  remove(@Param('id') id: number) {
    return this.moviesService.remove(id);
  }

  @Patch('/:id')
  update(@Param('id') id: number, @Body() movieDto: UpdateMovieDto) {
    return this.moviesService.update(id, movieDto);
  }
}
