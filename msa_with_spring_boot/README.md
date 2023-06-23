# 스프링 부트를 활용한 마이크로서비스 개발

> 책 "스프링 부트를 활용한 마이크로서비스 개발"의 코드입니다.

## 마일스톤

1. 책 고대로 copy & paste
2. 복습 (1) 코프링과 Next.js로 코드 재작성하기
    1. Language: 
        * BE: Java/Spring -> Kotlin/Spring
        * FE: Java/Spring -> Typescript/Next.js
    2. Runtime: Local Process -> Docker
    2. API Gateway: Zuul -> Spring Cloud Gateway
    3. Circuit Breaker: Hystrix -> Spring Cloud Circuit Breaker
    4. Message Broker:  RabitMQ -> Kafka 이관<F2> 
3. 복습 (2) Helm Chart 생성하여, Kubernetes 환경으로 이관한기
4. 복습 (3) 모니터링 시스템 끼얹기
    1. Distributed Tracing: OTEL + Tempo
    2. Metric: Mimir
    2. Log: Loki
