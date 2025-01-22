package microservice.book.multiplication.service;

import microservice.book.multiplication.domain.Multiplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.BDDMockito.given;


@ExtendWith({SpringExtension.class, MockitoExtension.class})
@SpringBootTest
class MultiplicationServiceTest {
    @MockitoBean
    private RandomService randomService;

    @Autowired
    private MultiplicationService multiplicationService;

    @Test
    public void 랜덤_곱셈_테스트(){
        given(randomService.generateRandomFactor()).willReturn(50, 30);

        Multiplication multiplication = multiplicationService.createRandomMultiplication();
        assertThat(multiplication.getFactorA()).isEqualTo(50);
        assertThat(multiplication.getFactorB()).isEqualTo(30);
        assertThat(multiplication.getResult()).isEqualTo(50 * 30);
    }
}