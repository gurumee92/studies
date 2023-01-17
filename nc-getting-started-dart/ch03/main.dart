// named parameter default
String sayHello({String name = "nico"}) => "hello $name, nice to meet you";

// named parameter required
num add({required num a, b}) => a + b;

// optional paramter
String sayNameContury(String name, [String? contury = "Korean"]) =>
    "my name is $name and I'm from $contury";

// qq operator
String capitalizeName(String? name) => name?.toUpperCase() ?? "None";

void main() {
  var say = sayHello(name: "gurumee");
  print(say);
  var result = add(a: 3, b: 5);
  print(result);
  say = sayNameContury("nico");
  print(say);
  print(sayNameContury("gurumee", "American"));

  print(capitalizeName("gurumee"));
  print(capitalizeName(null));
}
