package lab3;

/**
 * <strong>Create PickingOrder</strong>
 * <p>
 * Define a class named <i>PickingOrder</i>. Declare a private string field that
 * holds the apple type to indicate whether the picking order for
 * <strong><code>McIntosh</code> , <code>Cortland</code>, <code>Empire</code>, <code>Gala</code> or <code>Honeycrisp</code></strong>.
 * <p>
 * Also, declare a private string field that hold the bag size to indicate
 * the bag size. You have the following bag sizes   <strong><code>FiveLB</code> ,<code>TenLB</code> , <code>FifteenLB</code> or <code>TwentyLB</code></strong>.
 */
public class PickingOrder {

    /**
     * The picking order appletype  can be one of the following choices
     * <strong><code>McIntosh</code> , <code>Cortland</code>, <code>Empire</code>, <code>Gala</code> or <code>Honeycrisp</code></strong>.
     * <p>
     * The default value is <strong> <code>Cortland</code></strong>
     * </p>
     */
    // ALREADY IMPLEMENTED; DO NOT MODIFY
    private String appleType;


    /**
     * The bag size can be one of the following choice
     * <strong><code>FiveLB</code> ,<code>TenLB</code> , <code>FifteenLB</code> or <code>TwentyLB</code></strong>.
     * <p>
     * The default value is <strong> <code>TenLB</code></strong>
     * </p>
     */
    // ALREADY IMPLEMENTED; DO NOT MODIFY
    private String bagSize;


    /**
     * Default constructor set the attributes to default values
     */
    public PickingOrder() {
        // TODO: Your implementation starts here
        this.appleType = "Cortland";
        this.bagSize = "TenLB";
    }

    /**
     * Constructor create a new PickingOrder by assigned appleType and bagSize  attributes.
     *
     * @param appleType the apple type
     * @param bagSize   the bag size
     *                  <p><strong> Precondition </strong></p>
     *                  <p>The apple type should be one of the following choices
     *                  <strong><code>McIntosh</code> , <code>Cortland</code>, <code>Empire</code>, <code>Gala</code> or <code>Honeycrisp</code></strong>.
     *                  <p> and The bag size should be one of the following choices
     *                  <strong><code>FiveLB</code> ,<code>TenLB</code> , <code>FifteenLB</code> or <code>TwentyLB</code></strong>.</p>
     * @throws IllegalArgumentException <p> if the apply type is not one of the following choices
     *                                  <strong><code>McIntosh</code> , <code>Cortland</code>, <code>Empire</code>, <code>Gala</code> or <code>Honeycrisp</code></strong>.
     *                                  or if the bag size is not one of the following choices
     *                                  <strong><code>FiveLB</code> ,<code>TenLB</code> , <code>FifteenLB</code> or <code>TwentyLB</code></strong> </p>
     */

    public PickingOrder(String appleType, String bagSize) {

        // TODO: Your implementation starts here
        this.appleType = appleType;
        this.bagSize = bagSize;

        // Using two if statements to throw an exception if the inputted choice is not valid
        if(!(appleType.equals("McIntosh")) && !( appleType.equals("Cortland")) && !(appleType.equals("Empire")) && !(appleType.equals("Gala")) && !(appleType.equals("Honeycrisp"))){
            throw new IllegalArgumentException("not an apple type");
        }
        if(!(bagSize.equals("FiveLB")) && !(bagSize.equals("TenLB")) && !(bagSize.equals("FifteenLB")) && !(bagSize.equals("TwentyLB"))){
            throw new IllegalArgumentException("not an bag type");
        }
    }


    /**
     * Copy constructor Set the apple type and bag size by copying another picking
     * order attributes
     *
     * @param otherOrder another picking  order
     */
    public PickingOrder(PickingOrder otherOrder) {
        // TODO: Your implementation starts here
        this.appleType= otherOrder.appleType;
        this.bagSize= otherOrder.bagSize;
    }


    /**
     * Sets the apple type of this picking order object to <strong>
     * <code>newAppleType</code></strong>.
     *
     * @param newAppleType the new apple type
     *                     <p><strong> Precondition </strong></p>
     *                     <p>The apple type should be one of the following choices
     *                     <strong><code>McIntosh</code> , <code>Cortland</code>, <code>Empire</code>, <code>Gala</code> or <code>Honeycrisp</code></strong>.
     * @throws IllegalArgumentException <p> if the apply type is not one of the following choices
     *                                  <strong><code>McIntosh</code> , <code>Cortland</code>, <code>Empire</code>, <code>Gala</code> or <code>Honeycrisp</code></strong>.
     */

    public void setAppleType(String newAppleType) {

        // TODO: Your implementation starts here
        // again using an if statement for throwing an exception
        if(!(newAppleType.equals("McIntosh")) && !( newAppleType.equals("Cortland")) && !(newAppleType.equals("Empire")) && !(newAppleType.equals("Gala")) && !(newAppleType.equals("Honeycrisp"))){
            throw new IllegalArgumentException("not an apple type");
        }
        else{
            // if input is valid it will set the variable
            this.appleType= newAppleType;
        }


    }

    /**
     * Sets the bag size of this apple order object to
     * <strong><code>newBagSize</code></strong>.
     *
     * @param newBagSize the new bag size
     *                   <p><strong> Precondition </strong></p>
     *                   <p> The bag size should be one of the following choices
     *                   <strong><code>FiveLB</code> ,<code>TenLB</code> , <code>FifteenLB</code> or <code>TwentyLB</code></strong>.</p>
     * @throws IllegalArgumentException <p>if the bag size is not one of the following choices
     *                                  <strong><code>FiveLB</code> ,<code>TenLB</code> , <code>FifteenLB</code> or <code>TwentyLB</code></strong> </p>
     */


    public void setBagSize(String newBagSize) {

        // TODO: Your implementation starts here
        // again using an if statement for throwing an exception
        if(!(newBagSize.equals("FiveLB")) && !(newBagSize.equals("TenLB")) && !(newBagSize.equals("FifteenLB")) && !(newBagSize.equals("TwentyLB"))){
            throw new IllegalArgumentException("not an bag type");
        }
        else{
            // if input is valid it will set the variable
            this.bagSize = newBagSize;
        }
    }


    /**
     * Get the appleType value for this picking  order
     *
     * @return the appleType  value for this picking  order
     */
    public String getAppleType() {
        // variable to store the cost of the apple
        String appleprice = "0.0";

        //Using if statements to assign the cost of the apple to a variable
        if(appleType =="McIntosh"){
            appleprice="9.0";
        }

        else if (appleType == "Cortland"){
            appleprice="5.0";
        }
        else if(appleType == "Empire"){
            appleprice="8.0";
        }
        else if (appleType == "Gala"){
            appleprice="6.0";
        }
        else if (appleType == "Honeycrisp"){
            appleprice="15.0";
        }
        // TODO: Your implementation starts here
        return appleprice;
    }

    /**
     * Get the bagSize value for this picking  order
     *
     * @return the appleSize  value for this picking order
     */
    public String getBagSize() {
        // variable to store the cost of the bag size
        String bagprice = "0.0";

        //Using if statements to assign the cost of the bag size to a variable
        if(bagSize =="FiveLB"){
            bagprice="6.0";
        }
        else if (bagSize == "TenLB"){
            bagprice="10.45";
        }
        else if(bagSize == "FifteenLB"){
            bagprice="14.5";
        }
        else if (bagSize == "TwentyLB"){
            bagprice="15.0";
        }
        // TODO: Your implementation starts here
        return bagprice;
    }


    /**
     * This method calculate the picking Order price.
     * <p>
     * After determining the apple type and bag size, the picking  order price (in dollars) can be calculated
     * according to the following rules:
     * <p> {@code  Order cost = 8 + (apple type cost)*1.2 + (bag size cost) * 2.5}  </p>
     * The following parameters for apple type and bag size:
     * <p>
     * apple type
     * </p>
     * <strong><code>McIntosh</code> : 9$ ,
     * <code>Cortland</code>: 5$,
     * <code>Empire</code>: 8$,
     * <code>Gala</code>: 6$ or
     * <code>Honeycrisp</code>: 15$</strong>.
     *
     * <p>
     * bag size
     * </p>
     * <p>
     * <code>FiveLB</code>:  6$, <code>TenLB</code>: 10.45$, <code>FifteenLB</code>: 14.5$
     * , <code>TwentyLB</code>: 15$
     * </p>
     *
     * @return The picking order  price in dollar rounded to one decimal place.
     */
    public double getPickingOrderPrice() {
        // TODO: Your implementation starts here

        //storing the cost of the apple and bagsize into two variables of type double
       double applecost = Double.parseDouble(getAppleType());
       double bagcost = Double.parseDouble(getBagSize());

       // calculating the total cost and rounding it to one decimal
       double ordercost = 8 + applecost*1.2 + bagcost*2.5;
       ordercost= Math.round(ordercost*10.0)/10.0;
        return ordercost;

    }


    // ALREADY IMPLEMENTED; DO NOT MODIFY
    @Override
    public String toString() {
        // ALREADY IMPLEMENTED; DO NOT MODIFY
        return "Picking Order with apple Type (" + appleType + ") and bag Size (" + bagSize + ")";
    }
}
