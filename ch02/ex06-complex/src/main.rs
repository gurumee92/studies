use num::complex::Complex; // (1) use 키워드로 Complex 타입을 지역 범위로 가져온다.

fn main() {
    let a = Complex { re: 2.1, im: -1.2 }; // (2) 모든 러스트 타입은 리터럴 구문을 가지고 있다.
    let b = Complex::new(11.1, 22.2); // (3) 대부분의 데이터 타입은 정적 메서드 new를 구현한다.
    let result = a + b;
    println!("{} + {}i", result.re, result.im); // (4) 점 연산자를 이용해서 필드 값에 접근한다.
}
