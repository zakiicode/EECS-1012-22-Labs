package lab4;
/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class VendingMachine {
    // variables
    private String recent;
    private int cheetostock;
    private int cokestock;
    private int doritostock;
    private int redbullstock;

    //constructor
    public VendingMachine() {
        this.cheetostock = 0;
        this.cokestock = 0;
        this.doritostock = 0;
        this.redbullstock = 0;
        this.recent = "Empty VM Started";
    }
    public String getMessage() {
        return recent;
    }

    public String checkStock(String prod) {
        String result =" ";
        // using an if statement to check if the input is invalid
        if(!(prod.equals("Cheetos Crunchy")) && !( prod.equals("Coke")) && !(prod.equals("Doritos Nacho Cheese")) && !(prod.equals("Red Bull"))){
            result = "Invalid product: "+prod;
        }
        //using a switch to display the stocks of each product
        switch (prod){
            case "Cheetos Crunchy":
                result= "Cheetos Crunchy (" + cheetostock +")";
                break;
            case "Coke":
                result= "Coke (" + cokestock +")";
                break;
            case "Doritos Nacho Cheese":
                result= "Doritos Nacho Cheese (" + doritostock +")";
                break;
            case "Red Bull":
                result= "Red Bull ("+ redbullstock+")";
                break;
        }
        return result;
    }

    // a second checkstock method to display the stocks of all products
    public String checkStock() {
        String result ="Stock: Cheetos Crunchy (" + cheetostock +"), Coke (" + cokestock +"), Doritos Nacho Cheese (" + doritostock +"), Red Bull ("+ redbullstock+")";
        return result;
    }
    public void add(String prod, int i) {

        //using a switch to add the desired amount to each product stock

        switch (prod){
            case "Cheetos Crunchy":
                cheetostock =cheetostock +i;
                recent = "Product added: "+prod+" ("+i+")";
                break;
            case "Coke":
                cokestock= cokestock +i;
                recent = "Product added: "+prod+" ("+i+")";
                break;
            case "Doritos Nacho Cheese":
                doritostock= doritostock +i;
                recent = "Product added: "+prod+" ("+i+")";
                break;
            case "Red Bull":
                redbullstock= redbullstock+i;
                recent = "Product added: "+prod+" ("+i+")";
                break;
            default:
                recent = "Invalid product: "+prod;
        }
    }

    public void dispense(String prod, int i) {
        //using a switch to remove the desired amount to each product stock

        switch (prod){
            case "Cheetos Crunchy":
                cheetostock =cheetostock -i;
                recent = "Product removed: "+prod+" ("+i+")";
                break;
            case "Coke":
                cokestock= cokestock -i;
                recent = "Product removed: "+prod+" ("+i+")";
                break;
            case "Doritos Nacho Cheese":
                doritostock= doritostock -i;
                recent = "Product removed: "+prod+" ("+i+")";
                break;
            case "Red Bull":
                redbullstock= redbullstock-i;
                recent = "Product removed: "+prod+" ("+i+")";
                break;
            default:
                recent = "Invalid product: "+prod;

        }
    }
    // TODO: implement this class

}
