package Chapter10.Homework;

public class CourseGradesDemo {

    public static void main(String[] args) {

        GradedActivity labActivity = new GradedActivity(75);
        PassFailExam passFailExam = new PassFailExam(10, 2, 70);
        Essay essay = new Essay(25, 20,15,25);
        FinalExam finalExam = new FinalExam(50, 10);


        CourseGrades CG = new CourseGrades();
        CG.setLab(labActivity);
        CG.setPassFailExam(passFailExam);
        CG.setEssay(essay);
        CG.setFinalExam(finalExam);

        System.out.println(CG.toString());

        System.out.println("The highest score is " + CG.getHighest().getScore() +
                "\nThe lowest score is " + CG.getLowest().getScore()
                + "\nThe average score is " + CG.getAverage());


    }

}
