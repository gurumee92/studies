use std::convert::TryInto; // (1) try_into 메서드가 구현된 u16과 같은 타입에 해당 메소드를 쓸 수
                           // 있게 한다.

fn main() {
    let a: i32 = 10;
    let b: u16 = 100;

    let b_ = b.try_into().unwrap(); // (2) try_into는 변환 시도의 결과로 Result  타입을 반환한다.
    if a < b_ {
        println!("Ten is less than one hundred");
    }
}
