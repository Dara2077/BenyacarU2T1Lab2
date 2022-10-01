public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot debbie = new ChatBot("debbie", 10);
        debbie.greeting("Dara");
        debbie.weather();
        System.out.println("Let's convert 8 feet to meters! 8 feet is " + debbie.convertFeetToMeters(8) + " meters");
        debbie.favoriteNumber(10);
        System.out.println("Let us add 1, 2, and 3 together, for a sum of " + debbie.addNumbers(1, 2, 3));
        System.out.println(debbie.goodbye());
        debbie.favoriteAnimal("Elephant");
        System.out.print("The sum of our ages is " + debbie.sumAges(15));
    }
}
