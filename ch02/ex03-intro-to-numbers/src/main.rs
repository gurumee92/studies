fn main() {
    let twenty = 20; // (1) 러스트는 타입이 지정되어 있지 않은 경우 사용자를 대신하여 해당 타입을
                     // 추론한다.
    let twenty_one: i32 = 21; // (2) 타입 애너테이션을 붙여 타입을 지정한다.
    let twenty_two = 22i32; // (3) 타입 접미사를 이용해 타입을 지정한다.

    let addition = twenty + twenty_one + twenty_two;
    println!(
        "{} + {} + {} = {}",
        twenty, twenty_one, twenty_two, addition
    );

    let one_million: i64 = 1_000_000; // (4) 밑줄은 단지 가독성을 높여 주는 용도로 컴파일러는 이를
                                      // 무시한다.
    println!("{}", one_million.pow(2)); // (5) 숫자는 메서드를 가진다

    let forty_twos = [42.0, 42f32, 42.0_32]; // (6) 배열은 모두 같은 타입이어야 하며 대괄호로 묶어
                                             // 생성한다.
    println!("{:02}", forty_twos[0]); // (7) 배열 내의 요소는 0부터 시작하여 숫자로 인덱싱할 수
                                      // 있다.
}
