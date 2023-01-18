class Player {
  String name;
  int xp;

  Player({required this.name, required this.xp});
  Player.create1000XpPlayer({required String name})
      : this.name = name,
        this.xp = 1000;

  void sayHello() {
    print("$name, $xp");
  }
}

void main(List<String> args) {
  var p1 = Player(name: "gurumee", xp: 1500)
    ..name = "nico"
    ..xp = 50;
  p1.sayHello();
  var p2 = Player.create1000XpPlayer(name: "nico");
  p2.sayHello();
}
