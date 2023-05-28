import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isRunning = true;

            Scanner sc = new Scanner(System.in);
            AnimeDatabase aList = new AnimeDatabase();

            while (isRunning) {
                System.out.println("""
                    ------------------------------
                    Welcome to the Anime Reviewer!
                    ------------------------------
                    What do you want to do ?
                    1. Add anime to the collection.
                    2. Show anime list.
                    3. Give review to an anime.
                    4. Quit.
                    """);
                String choose = sc.nextLine();
            switch (choose) {
                case "1":   //Adds anime's
                    aList.addAnime();
                    break;
                case "2":  //Shows anime
                    aList.showAnime();
                    break;
                case "3":  //Gives rating to anime
                    break;
                default:
                    System.out.println("Bye :)."); //Exits the application

                    isRunning = false;
                    break;
            }

        }
    }
}
