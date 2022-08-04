package lab7;

public class Chair {
    private String chairType;
    private String chairColor;

    public Chair(){
        this.chairType = "Computer";
        this.chairColor = "Blue";
    }

    public Chair(Chair other){
        String chairType=other.chairType;
        String chairColor=other.chairColor;
    }

    public Chair(String chairType, String chairColor){
        if ((!(chairType.equals("Computer")) && (!(chairType.equals("Conference"))) && (!(chairType.equals("Executive"))))){
            throw new IllegalArgumentException("not valid choice");
        }
        else{
            this.chairType = chairType;
        }
        if (!(chairColor.equals("Blue")) && !(chairColor.equals("Red")) && !(chairColor.equals("Gray"))&& !(chairColor.equals("Yellow"))&& !(chairColor.equals("White"))&& !(chairColor.equals("Orange"))){
            throw new IllegalArgumentException("not valid choice");
        }
        else{
            this.chairColor = chairColor;
        }


    }
    public double getChairManufacturingCost() {
        double cost = 0.0;

        if (chairType.equals("Computer")){
            if (chairColor.equals("Blue")) {
                cost=75.0;
            }
            else if(chairColor.equals("Red")) {
                cost=85.0;
            }
            else if(chairColor.equals("Gray")) {
                cost=70.0;
            }
        }
        else if (chairType.equals("Conference")){
            if (chairColor.equals("Blue")) {
                cost=80.0;
            }
            else if(chairColor.equals("Yellow")) {
                cost=95.0;
            }
            else if(chairColor.equals("Gray")) {
                cost=85.0;
            }
        }
        else if (chairType.equals("Executive")){
            if (chairColor.equals("Blue")) {
                cost=280.0;
            }
            else if(chairColor.equals("White")) {
                cost=295.0;
            }
            else if(chairColor.equals("Orange")) {
                cost=285.0;
            }
        }

        else{
            return 0.0;
        }
        double tax = cost*0.13;



        return (cost+tax);
    }
}
