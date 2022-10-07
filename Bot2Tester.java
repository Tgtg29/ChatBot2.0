import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       //Start Here!
       System.out.print("Hello. What is your name? ");
       Scanner input = new Scanner(System.in);
       String name1 = input.nextLine();
       Bot2 bot = new Bot2(name1);
       bot.greeting();
       System.out.println("What is your favorite animal?");
       String animal = input.nextLine();
       bot.favoriteAnimal(animal);
       System.out.println("Where do you live?");
       String loc = input.nextLine();
       bot.home(loc);
       System.out.println("What is your favorite number?");
       int fnum = input.nextInt();
       bot.favoriteNumber(fnum);
       bot.goodbye();
    }
}