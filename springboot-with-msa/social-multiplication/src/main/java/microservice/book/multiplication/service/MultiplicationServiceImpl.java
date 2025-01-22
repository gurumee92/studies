package microservice.book.multiplication.service;

import microservice.book.multiplication.domain.Multiplication;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationServiceImpl implements MultiplicationService{
    private final RandomService randomService;

    public MultiplicationServiceImpl(RandomService randomService){
        this.randomService = randomService;
    }

    @Override
    public Multiplication createRandomMultiplication() {
        int factorA = randomService.generateRandomFactor();
        int factorB = randomService.generateRandomFactor();
        return new Multiplication(factorA, factorB);
    }
}
