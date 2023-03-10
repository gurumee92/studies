void main(List<String> args) {
  // List
  var giveMeFive = false;
  var numbers = [
    1,
    2,
    3,
    4,
    if (giveMeFive) 5, // collection if
  ];
  print(numbers);

  // string interpolation
  var name = "nico";
  var age = 10;
  var greeting = "Hello everyone, my name is ${name} my age is ${age + 2}";
  print(greeting);

  // collection for
  var oldFrineds = ["nico", "lynn"];
  var newFrineds = [
    "lewis",
    "ralph",
    for (var friend in oldFrineds) "bb $friend",
  ];
  print(newFrineds);

  // map
  var player = {
    "name": "nico",
    "age": 19,
    "score": 5.0,
  };
  print(player);

  // set
  var s = {1, 2, 3, 4};
  print(s.difference({2, 3}));
}
