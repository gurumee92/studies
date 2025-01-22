package microservice.book.multiplication.service;

import org.springframework.stereotype.Service;

@Service
public interface RandomService {
    /**
     * @return 무작위로 만든 11 이상 99 이하의 인수
     */
    int generateRandomFactor();
}
