namespace HelloCsharp
{
    class GiftBox
    {
        public required string Letter;
        public int Money;
    }

    internal class Program
    {
        static void Main(string[] args)
        {
            GiftBox a = NewGiftBox(letter: "A 친구야 잘 지내니?", money: 100_000);
            GiftBox b = NewGiftBox(letter: "B 친구야 잘 지내니?", money: 120_000);
            GiftBox c = NewGiftBox(letter: "C 친구야 잘 지내니?", money: 130_000);

            List<GiftBox> boxes = [a, b];
            boxes.Add(c);
            for (int i = 0; i < boxes.Count; i++)
            {
                boxes[i].Money += 100;
            }

            foreach (GiftBox box in boxes)
            {
                PrintGiftBox(box);
            }

            foreach (var item in boxes)
            {
                PrintGiftBox(item);
            }
        }
        private static GiftBox NewGiftBox(string letter, int money)
        {
            GiftBox box = new()
            {
                Letter = letter,
                Money = money,
            };
            return box;
        }

        private static void PrintGiftBox(GiftBox box)
        {
            Console.WriteLine($"내용: {box.Letter}, 돈: {box.Money}");
        }
    }
}