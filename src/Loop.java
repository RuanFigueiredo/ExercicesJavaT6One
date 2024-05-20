import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner read =  new Scanner(System.in);
        double noteAverage = 0;
        double note = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("enter film note");
            note = read.nextDouble();

            noteAverage += note;
        }

        System.out.println("Average of notes: " + noteAverage/3);
    }
}
