fn main() {
    let penguin_data = "\
    common name,length (cm)
    Little penguin,33
    Yellow-eyed penguin,65
    Fiordland penguin,60
    Invalid,dat
    "; // (2) \ 뒤에 오는 줄바꿈을 피한다.
    let records = penguin_data.lines();

    for (i, record) in records.enumerate() {
        if i == 0 || record.trim().len() == 0 {
            // (3) 제목과 공백이 있는 줄은 처리하지 않고
            // 넘긴다.
            continue;
        }

        let fields: Vec<_> = record // (4) 한 줄 텍스트로 시작한다.
            .split(',') // (5) record를 field로 나눈다.
            .map(|field| field.trim()) // (6) 각 field의 양 끝 공백을 지운다.
            .collect(); // (7) field 모음 벡터를 하나로 합친다.
        if cfg!(debug_assertions) {
            // (8) cfg!는 컴파일 시 주어진 환경을 검사한다.
            eprintln!("debug: {:?} -> {:?}", record, fields); // (9) 표준 에러 출력
        }

        let name = fields[0];
        if let Ok(length) = fields[1].parse::<f32>() {
            // (10)
            println!("{}, {}cm", name, length);
        }
    }
}
