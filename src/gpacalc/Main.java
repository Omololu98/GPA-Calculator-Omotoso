package gpacalc;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);
        System.out.println("Kindly provide your name");
        String myName = in.nextLine();
        System.out.println("**************************************************");
        System.out.printf("Welcome %s to your GPA Calculator\n",myName);
        System.out.println("**************************************************\n");
        int numCourse,unit,score;
        while (true){
            try {
                System.out.println("How many courses did you register for?");
                numCourse = in.nextInt();
                if (numCourse < 0){
                        throw new IllegalArgumentException("Input must be greater than zero");
                }
                break;
            }
            catch (Exception e) {
                System.out.println("Wrong Input");
                in.nextLine();
            }
        }

        if (numCourse==0) {
            System.out.printf("%s you did not register for any course\nThanks for using the GPA calculator",myName);
            System.exit(99);
        }
        else {

            Courseinfo allCourses [] = new Courseinfo[numCourse];
            in.nextLine();
           for (int i = 0; i < numCourse; i++) {

               Courseinfo course = new Courseinfo();
               System.out.printf("\nRegistration of Course %d:\n", i+1);
               System.out.println("\nProvide course Name and Code");
               String name = in.nextLine();
               course.setName(name);
               while (true) {
                   try {
                       System.out.printf("Provide the unit for %s:",course.getName());
                       unit = in.nextInt();
//                       in.nextLine();
                       if (unit <= 0 || unit >6){
                           throw new IllegalArgumentException("Wrong Unit");
                       }
                       break;
                   }
                   catch (Exception e) {
                       System.out.println("Wrong Unit provided");
                       in.nextLine();
                   }
               }
               course.setUnit(unit);
               while (true) {
                   try {
                       System.out.printf("Provide the score for %s:",course.getName());
                       score = in.nextInt();
                       in.nextLine();
                       if (score < 0 || score >100){
                           throw new IllegalArgumentException("Wrong Unit");
                       }
                       break;
                   }
                   catch (Exception e) {
                       System.out.println("Wrong Score provided");
                       in.nextLine();
                   }
               }
               course.setScore(score);
               allCourses[i] = course;
           }
            CalculatorService calculatorService = new CalculatorService();
            calculatorService.getGPA(allCourses);
            PrintResult printResult = new PrintResult();
            printResult.printResult(allCourses);
            System.out.printf("Your GPA is = %.2f to 2 decimal places\n", calculatorService.getGPA(allCourses));
            System.out.printf("%sThank you for using the GPA calculator",myName);
            System.exit(50);
        }


    }

}




































































































































