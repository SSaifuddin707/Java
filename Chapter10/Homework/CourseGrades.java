package Chapter10.Homework;

public class CourseGrades implements Analyzable {
    private GradedActivity[] grades = new GradedActivity[4];

    public void setLab( GradedActivity GA){
        grades[0] = GA;
    }
    public void setPassFailExam(PassFailExam PFE){
        grades[1] = PFE;
    }
    public void setEssay(Essay e){
        grades[2] = e;
        e.calculateTotalScore();
    }
    public void setFinalExam(FinalExam FE){
        grades[3] = FE;
    }
    public String toString(){
        return "Lab Score= " + grades[0].getScore() + "\nLab Grade= " + grades[0].getGrade() +
                "\nExam Grade= " + grades[1].getGrade() +
                "\nEssay Score= " + grades[2].getScore() + "\nEssay Grade = " + grades[2].getGrade() +
                "\nFinal Exam Score= " + grades[3].getScore() + "\nFinal Exam Grade= " + grades[3].getGrade();
    }

    @Override
    public double getAverage() {
        double sum = 0;
        double average;
        for (int i = 0; i < grades.length; i++){
            sum = sum + grades[i].getScore();
        }
        average = sum/4;

        return average;
    }

    @Override
    public GradedActivity getHighest() {
        double highest = grades[0].getScore();
        GradedActivity highestGA = new GradedActivity();
        for (int i = 0; i < grades.length; i++){
            if (highest < grades[i].getScore()){
                highest= grades[i].getScore();
                highestGA = grades[i];
            }else continue;
        }
        return highestGA;
    }

    @Override
    public GradedActivity getLowest() {
        double lowest = grades[0].getScore();
        GradedActivity lowestGA = new GradedActivity();
        for (int i = 0; i < grades.length; i++){
            if (lowest > grades[i].getScore()){
                lowest = grades[i].getScore();
                lowestGA = grades[i];
            }else continue;
        }
        return lowestGA;
    }
}