package lab5;

public class Participant {

    private String name;
    private Registration[] registrations= {};
    private int count;

    public Participant(String name) {

        this.name=name;
    }


    public Registration[] getRegistrations() {
        return registrations;
    }
    public int Grade(int marks) {
        int grade =0;
        if (marks>=90)
        {
            grade = 9;
        }
        else if (marks<90 && marks>=80)
        {
            grade = 8;
        }
        else if (marks<80 && marks>=70)
        {
            grade = 7;
        }
        else if (marks<70 && marks>=60)
        {
            grade = 6;
        }
        else if (marks<60 && marks>=50)
        {
            grade = 5;
        }
        else
        {
            grade = 0;
        }

        return grade;
    }

    public String getGPAReport()
    {
        String report ="";
        if (registrations.length==0)
            report = "No GPA available yet for "+ name;
        else {
            report =name+"'s GPA of {";
            double length = registrations.length;
            double sum = 0.0;
            for(int i=0;i<length;i++) {
                sum = sum + Grade(registrations[i].getMarks());
                if(i<length-1) report =report + Grade(registrations[i].getMarks())+" ("+registrations[i].getGradeReport()[0]+"), ";
                else report =report + Grade(registrations[i].getMarks())+" ("+registrations[i].getGradeReport()[0]+")";
            }
            double gpa = sum/length;
            report = report +"}: "+Math.round(gpa*10.0)/10.0;
        }
        return report;
    }

    public int marksOf(String name) {
        int marks =-1;
        for (int i=0;i<registrations.length;i++)
        {
            if(name.equals(registrations[i].getTitle()))
                return registrations[i].getMarks();
        }
        return marks;
    }

    public void addRegistration(String name) {
        int length = registrations.length;
        if (count < 5){
            Registration[] addreg = new Registration[length+1];
            for(int i=0;i<length;i++)
            {
                addreg[i]=registrations[i];
            }
            addreg[length]= new Registration(name);
            registrations=addreg;
            count++;
        }
    }
    public void addRegistration(Registration registration) {
        int length = registrations.length;
        if (count < 5){
            Registration[] addreg = new Registration[length+1];
            for(int i=0;i<length;i++) {
                addreg[i]=registrations[i];
            }
            addreg[length]= registration;
            registrations=addreg;
            count++;
        }
    }

    public void updateMarks(String name, int newMark) {
        int length = registrations.length;

        for (int i = 0; i < length; i++) {
            if(name.equals(registrations[i].getTitle())){
                registrations[i].setMarks(newMark);
            }
        }
    }

    public void clearRegistrations() {
        registrations = new Registration[0];

    }



}
