import {Body, Controller, Delete, Get, Param, Patch, Post,} from '@nestjs/common';
import {MoviesService} from './movies.service';
import {Movie} from './entities/movies.entity';
import {CreateMovieDto} from "./dto/movies.dto";

@Controller('movies')
export class MoviesController {
  constructor(private readonly moviesService: MoviesService) {}

  @Post()
  create(@Body() movieData: CreateMovieDto) {
    return this.moviesService.create(movieData);
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
  update(@Param('id') id: number, @Body() updateData) {
    return this.moviesService.update(id, updateData);
  }
}
