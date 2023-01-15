void main() {
  var i = 5;
  int j = i + 5;
  print(i + j);

  //dynamic 동적으로 타입이 변하는 변수를 지정하고 싶을 때 사용.
  dynamic d;
  d = "string";
  if (d is String) {
    print(d.toUpperCase());
  }

  d = 5;
  if (d is int) {
    print(i + j + d);
  }

  // nullable
  String? nico = "nico";
  nico = null;

  if (nico != null) {
    print(nico.length);
  }

  // final
  final int x = 5;
  print(x);

  // late는 api fetch 이후, 사용.. 비동기 코드를 위한 키워드인 듯
  late final String name;

  // do something like fetch api
  name = "gurumee";
  print(name);
}
