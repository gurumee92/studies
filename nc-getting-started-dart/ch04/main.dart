enum XP { begginer, expert, pro }

class QuickRunner {
  void run() {
    print("ruuuuuuuuuuuuuuuun!");
  }
}

class Player with QuickRunner {
  String name;
  XP xp;

  Player({required this.name, required this.xp});
  Player.createProPlayer({required String name})
      : this.name = name,
        this.xp = XP.pro;

  void sayHello() {
    print("$name, $xp");
  }
}

void main(List<String> args) {
  var p1 = Player(name: "gurumee", xp: XP.begginer)
    ..name = "nico"
    ..xp = XP.expert;
  p1.sayHello();
  p1.run();
  var p2 = Player.createProPlayer(name: "nico");
  p2.sayHello();

  var t = XP.begginer;
  print(t);
}
