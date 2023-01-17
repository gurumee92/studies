class Player {
  late final String name;
  late final int xp;

  Player({required this.name, required this.xp});
  Player.create1000XpPlayer({required String name})
      : this.name = name,
        this.xp = 1000;

  void sayHello() {
    print("$name, $xp");
  }
}

void main(List<String> args) {
  var p1 = Player(name: "gurumee", xp: 1500);
  p1.sayHello();

  var p2 = Player.create1000XpPlayer(name: "nico");
  p2.sayHello();
}
