//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("This is my Screen Match!");
        System.out.println("Movie: Top gun: Maverick");

        int releaseYear = 2000;
        System.out.println("Release of Year: " + releaseYear);
        boolean includedInThePlan = true;

        double movieScore = 8.5;

        // average of the notes the Ruan, Jack and Jerry
        double average = (10 + 10 + 7) / 3;
        System.out.println(average);

        String synopsis;
        synopsis = """
                    Top Movie Gun top
                    Adventure movie is good
                    Very good!
                    release Year:
                
                """ + releaseYear;
        System.out.println(synopsis);

        int classification = (int)(average/2);
        System.out.println(classification);


    }
}