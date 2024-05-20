import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner read =  new Scanner(System.in);
        System.out.println("enter your favorite movie: ");
        String movie = read.nextLine();
        System.out.println("what is the year of release: ");
        int yearRelease = read.nextInt();
        System.out.println("Film note");
        int filmNote = read.nextInt();
        System.out.println(yearRelease);
        System.out.println(movie);
        System.out.println(filmNote);
    }
}
