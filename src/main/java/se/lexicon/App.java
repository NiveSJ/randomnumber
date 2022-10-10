package se.lexicon;

import java.util.Random;
import java.util.Scanner;

/**
 * Random Number Guess
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int number=0;
        int guess;
        int counter=0;
        int upperbound=500;
        Random rand= new Random();
        number=rand.nextInt(upperbound);

        //System.out.println("Rand number" + number);

        System.out.println( "Enter the number (Range is 0 to 500 )" );
        Scanner scan= new Scanner(System.in);
        guess=scan.nextInt();
        counter = ++counter;


          while(guess != number)
          {
              if (guess < number){
                  System.out.println("Your guess is too small, Enter new guess");
                  guess= scan.nextInt();
              }
              else
              {
                  System.out.println("your guess is too big,Enter new guess");
                  guess= scan.nextInt();
              }

              counter++;

          }

        System.out.println("You have got correct guess after" + " " + counter +" " + "attempt");
    }
}
