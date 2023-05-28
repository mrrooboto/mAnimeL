import java.util.Scanner;
public class AnimeDatabase {

    public Scanner sc = new Scanner(System.in);
    public ArrayList<String> AnimeList = new ArrayList<>();
    public ArrayList<Integer> AnimeRating = new ArrayList<>();

    public void addAnime() {
        System.out.println("Enter your anime name please: ");
        String animeName = sc.nextLine();
        AnimeList.add(animeName);
        System.out.println("Enter anime rating");
        Integer animeRating = Integer.parseInt(sc.nextLine());
        AnimeRating.add(animeRating);
        System.out.println("Anime successfully added :).");
    }
    public void showAnime() {
        System.out.println("Here is your anime list: ");
        for (String s : AnimeList) {
            System.out.println(s);
        }
        for (Integer i : AnimeRating) {
            System.out.println(i);
        }
    }



}
