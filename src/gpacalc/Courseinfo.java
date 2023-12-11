package gpacalc;

public class Courseinfo {

    private String name;
    private int unit;
    private int score;
    private char grade;
    private int point;


    public void setName(String name) {
            this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setUnit(int unit) {
            this.unit = unit;
    }

    public int getUnit() {
        return this.unit;
    }
    public void setScore(int score){
            this.score = score;
    }

    public int getScore() {
        return this.score;
    }
    public char getGrade() {
        if (this.score >= 70) {
            return 'A';
        } else if (this.score >= 60) {
            return 'B';
        } else if (this.score >= 50) {
            return 'C';
        } else if (this.score >= 45) {
            return 'D';
        } else if (this.score >= 40) {
            return 'E';
        } else {
            return 'F';
        }
    }

    public int getPoint() {
        if (this.score >= 70) {
            return 5;
        } else if (this.score >= 60) {
            return 4;
        } else if (this.score >= 50) {
            return 3;
        } else if (this.score >= 45) {
            return 2;
        } else if (this.score >= 40) {
            return 1;
        } else {
            return 0;
        }
    }
}















