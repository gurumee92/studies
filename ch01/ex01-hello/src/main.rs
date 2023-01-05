fn greet_world() {
    let english = "Hello World!"; // (1) 할당문. let 키워드를 이용한 변수 바인딩
    let korean = "안녕 세상아!"; // (2) 유티코드가 기본으로 제공됨
    let regions = [english, korean]; // (3) 배열 리터럴 표현 시 [] 사용

    for region in regions.iter() {
        // (4) 배열 같은 타입에 iterator를 제공하는 iter 메서드가
        // 있다.
        println!("{}", &region); // (5) &기호는 영역 내의 값을 읽기 전용으로 burrow 할 때
                                 // 사용된다.
    }
}

fn main() {
    greet_world(); // (6) 함수를 호출한다.
}
