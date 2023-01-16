// named parameter default
String sayHello({String name = "nico"}) => "hello $name, nice to meet you";

// named parameter required
num add({required num a, b}) => a + b;

void main() {
  var say = sayHello(name: "gurumee");
  print(say);
  var result = add(a: 3, b: 5);
  print(result);
}
