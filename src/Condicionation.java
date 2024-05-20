public class Condicionation {
    public static void main(String[] args) {

        int releaseYear = 2022;
        boolean includedInThePlan = true;
        double movieScore = 8.5;
        String TypeofPlan = "plus";

        if(releaseYear >= 2022){
            System.out.println("launch that the customer is liking");
        } else {
            System.out.println("old movie, worth watching");
        }

        if (includedInThePlan && TypeofPlan.equals("plus")){
            System.out.println("film released");
        }else {
            System.out.println("pending rent");
        };
  }
}
