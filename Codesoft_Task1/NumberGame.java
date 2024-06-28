import java.util.Random;
import java.util.Scanner;


public class NumberGame {

    public static void main(String args[])
    {
        int max=100,min=1;
        char again;

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        do 
        {
            int attemp= 5;
            //int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int random_num=(min + (int)(Math.random() * ((max - min) + 1)));
            //int random_num= random.nextInt(max - min+1)+max;
            System.out.println("Welcome to the Number Guessing Game!");
            
            while(attemp > 0)
            {
                //System.out.println("number"+ random_num);
                System.out.print("Guess the number Between 1 to 100:");
                int guess_num = sc.nextInt();
                int score=0;
                score+=guess_num;
                
                if(guess_num == random_num)
                {
                    System.out.println("*********************************");
                    System.out.println("Congratulaton!! you guest correct number");
                    System.out.println("Your Score: " + score);
                    System.out.println("*********************************");
                    break;
                }
                else if(guess_num > random_num)
                {
                    System.out.println("---------------------------------");
                    System.out.println("Guess number is High");
                    System.out.println("Try again.");
                    System.out.println("---------------------------------");
                }
                else
                {
                    System.out.println("---------------------------------");
                    System.out.println("Guess number is Low");
                    System.out.println("Try again.");
                    System.out.println("---------------------------------");
                }
                attemp--;
            }
            
            System.out.println("Random number:"+ random_num);
            System.out.println("*********************************");
            System.out.println("Do you want to run this program Again");
            again =sc.next().charAt(0);
        } while (again =='y' || again == 'Y');
        {
            System.out.println("Thank you for run the game");
        }
    }  
}