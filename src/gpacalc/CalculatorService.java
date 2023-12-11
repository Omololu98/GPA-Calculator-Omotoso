package gpacalc;

public class CalculatorService {

    double gradePoints;
    int totalUnits;
    double GPA;

    public double getTotalPoints(Courseinfo course[]) {

        double gradePoints = 0;
        for (int i =0; i<course.length; i++){
            gradePoints += course[i].getPoint() * course[i].getUnit();
        }
        return gradePoints;
    }

    public int getTotalUnits(Courseinfo course[]) {
        int totalUnits = 0;
        for (int i = 0; i < course.length; i++) {
            totalUnits += course[i].getUnit();
        }
        return totalUnits;
    }

    public double getGPA(Courseinfo courseinfo []) {
        // do not add any sign to the array just provide the parameter for it
        double x = getTotalPoints(courseinfo);
        int y = getTotalUnits(courseinfo);
        return (x/y);
    }

}























