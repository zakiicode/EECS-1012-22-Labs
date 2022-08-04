package lab5;

public class Registration{
    private String course;
    private Instructor instructor;
    private int mark=0;

    public Registration(String course) {
        this.course=course;
    }

    public Registration(String course, Instructor instructor) {
        this.course=course;
        this.instructor=instructor;
    }

    public String getTitle() {
        return course;
    }

    public int getMarks() {
        return mark;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public String[] getGradeReport() {
        String grade = " ";
        String desc = " ";
        if (mark>=90 && mark<=100){
            grade = "A+";
            desc= "Exceptional";
        }
        else if (mark>=80 && mark<=89){
            grade = "A";
            desc= "Excellent";
        }
        else if (mark>=70 && mark<=79){
            grade = "B";
            desc= "Good";
        }
        else if (mark>=60 && mark<=69){
            grade = "C";
            desc= "Competent";
        }
        else if (mark>=50 && mark<=59){
            grade = "D";
            desc= "Passing";
        }
        else if (mark>=0 && mark<=49){
            grade = "F";
            desc= "Failing";
        }
        String [] grRprt = {grade,desc};
        return grRprt;
    }

    public String getInformation() {
        String inf =" ";
        String [] grade = getGradeReport();
        if (instructor == null){
            inf = course + " has not yet been assigned an instructor";
        }
        else{
            inf = course +", taught by "+ instructor.getName() +", is completed with raw marks "+ getMarks ()+" ("+grade[0]+" ; "+grade[1]+")";
        }
        return inf;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor=instructor;
    }

    public void setMarks(int i) {
        this.mark=i;
    }
    // TODO: implement this class
}