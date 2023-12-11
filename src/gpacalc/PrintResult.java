package gpacalc;

public class PrintResult {

    public void printResult(Courseinfo courses[]){

         System.out.println("\n|-------------|-----------|-----|----------|");
         System.out.println("|COURSE & CODE|COURSE UNIT|GRADE|GRADE UNIT|");
         System.out.println("|-------------|-----------|-----|----------|");
         for (int i = 0; i < courses.length; i++){
             System.out.printf("|%-13s|%-11d|%-5s|%-10d|\n", courses[i].getName(),courses[i].getUnit(),courses[i].getGrade(),courses[i].getPoint());
         }
        System.out.println("|------------------------------------------|");

    }
}
