import { Controller, Get } from '@nestjs/common';

@Controller('')
export class AppController {
  @Get()
  home(): string {
    return 'nestjs movies api';
  }
}
