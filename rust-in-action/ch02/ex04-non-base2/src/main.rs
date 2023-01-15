fn main() {
    let three = 0b11; // (1) 0b 접두사는 이진수임을 나타낸다.
    let thirty = 0o36; // (2) 0o 접두사는 팔진수임을 나타낸다.
    let three_hundred = 0x12C; // (3) 0x 접두사는 16진수임을 나타낸다.

    println!("base 10: {} {} {}", three, thirty, three_hundred);
    println!("base 2: {:b} {:b} {:b}", three, thirty, three_hundred);
    println!("base 8: {:o} {:o} {:o}", three, thirty, three_hundred);
    println!("base 16: {:x} {:x} {:x}", three, thirty, three_hundred);
}
