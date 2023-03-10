fn main() {
    // (1) rust에서는 main 함수의 위치를 융통성 있게 배치할 수 있다.
    let a = 10; // (2) 데이터 타입은 컴파일러가 추론한다.
    let b: i32 = 20; // (3) 변수 선언 시 개발자가 직접 선언할 수 있다.
    let c = 30i32; // (4) 숫자 데이터 타입은 해당 리터럴 형식에 타입 애너테이션을 붙일 수 있다.
    let d = 30_i32; // (5) 숫자에 밑줄을 쓸 수 있다. 가독성을 좋게 하기 위해서일 뿐 그 외 기능적인
                    // 요소는 없다.
    let e = add(add(a, b), add(c, d));

    println!("(a + b) + (c + d) = {}", e);
}

fn add(i: i32, j: i32) -> i32 {
    // (6) 함수 정의에 타입 선언은 반드시 있어야 한다.
    i + j // (7) 함수의 최종 표현식 결과를 반환하기 위해 별도의 return은 필요하지 않다.
}
