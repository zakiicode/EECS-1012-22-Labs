package lab5;

public class Instructor {
    private String name;
    private int phone;
    private String email;

    public Instructor(String name, int phone, String email) {
        this.name=name;
        this.phone=phone;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public int getPhoneExtension() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getInformation() {
        return "Instructor " + name + " has campus phone extension " + phone + " and contact email " + email;
    }

    public void setName(String n) {
        this.name=n;
    }

    public void setPhoneExtension(int p) {
        this.phone=p;

    }

    public void setEmail(String e) {
        this.email=e;

    }
    // TODO: implement this class
}
