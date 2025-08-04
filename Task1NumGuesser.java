import java.util.Scanner;
import java.util.Random;

class GuessNum{
    public static void main(String[] args){
        Random random = new Random();
        int randomInt = random.nextInt(100) +1;
      
        int num;
        int attempts=0;
        int maxAttempts=5;

        System.out.println("\n\nWelcome to the Guess Number!");
        System.out.println("You have only 5 attempts to guess the number between 1 to 100!\n");
        Scanner sc= new Scanner(System.in);

         while (attempts < maxAttempts){
            
            System.out.print("Guess the number(1-100): ");  
            num= sc.nextInt();
            attempts++;

            if (num < randomInt){
                System.out.println("Your number is too small!\n");
            }

            else if (num > randomInt){
                System.out.println("Your number is too large!\n");
            }

            else{
                System.out.println("Correct Answer!\n");
                System.out.println("You guessed it in " + attempts + " attempts!\n");
                break;
            }

            if(attempts == maxAttempts){
                System.out.println("\nYou have used your all 5 Attempts!!!");
                System.out.println("Correct answer: " + randomInt);
            }
         }

         sc.close();
    }
}