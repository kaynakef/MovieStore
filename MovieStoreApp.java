package EnesMentoring.Apps;

import java.util.Scanner;

public class MovieStoreApp {
    public static void main(String[] args) {
// MovieStoreApp

        // We have a store that selling movies
        // We have two section for movies, Action and Drama
        // In each section we have three movies
        // Create an app for user that user will choose section and movie
        // prinout selected movie and prinout the price
        // Tip : if-else conditions

        /*

        Out put should be like this


What kind of movie would you like to watch today?
Action or Drama :
>>action

Welcome to action movie section

Choose a movie
John Wick, Gladiator, Lord of the Rings
>>gladiator

Gladiator has added to card
Amount : 9.99$
Enjoy the movie :)

         */

        Scanner sc=new Scanner(System.in);
        System.out.println(" ");
        System.out.println("*********************************************");
        System.out.println("      Welcome to Batch12 Movie Store         ");
        System.out.println("*********************************************");
        System.out.println(" ");
        System.out.println("What kind of movie would you like to watch today? ");
        System.out.println("Action or Drama? ");
        String category= sc.nextLine().toLowerCase().trim();

        switch (category){
            default:
                System.out.println("The "+ category+ " movie category is not available. Try again!");
                break;
            case ("action"):
                System.out.println("Welcome to "+ category+ " movie section.");
                System.out.println("Choose a movie: John Wick, Gladiator, Lord of the Rings");
              String movie= sc.nextLine().toLowerCase().trim();
               switch (movie){
                   default:
                       System.out.println("We don't have "+ movie+ " movie in this category please try again!");
                       break;
                   case ("john wick"):
                   case ("gladiator"):
                   case ("lord of the rings"):
                       System.out.println(movie+ "has added to card");
                       System.out.println("Amount is $9.99 \n Enjoy the movie");

               break;}
                break;

            case("drama"):
                System.out.println("Welcome to "+ category+ " movie section.");
                System.out.println("Choose a movie: Casablanca, The Irish Man, Roma");
                String movie1= sc.nextLine().toLowerCase().trim();
                switch (movie1){
                    default:
                        System.out.println("We don't have "+ movie1+ " movie in this category please try again!");
                        break;
                    case ("casablanca"):
                    case ("the irish man"):
                    case ("roma"):
                        System.out.println(movie1+ "has added to card");
                        System.out.println("Amount is $9.99 \n Enjoy the movie");

                break;}
                break;



        }






    }
}
