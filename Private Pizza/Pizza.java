package Evaluation;

public class Pizza {
    private int size, prpperoni_toppings, cheese_toppings;
    private double price;
    public double calcCost(){

        if (size == 1) {
            System.out.println("Pizza size is Small");
            System.out.println("With "+cheese_toppings+" cheese toppings & "+prpperoni_toppings+" pepperoni toppings");
            price = 10+(2*(cheese_toppings+prpperoni_toppings));
        }
        else if(size == 2){
            System.out.println("Pizza size is Medium");
            System.out.println("With "+cheese_toppings+" cheese toppings & "+prpperoni_toppings+" pepperoni toppings");
            price = 12+(2*(cheese_toppings+prpperoni_toppings));
        }
        else if(size == 3){
            System.out.println("For Large Pizza size, ");
            System.out.println("With "+cheese_toppings+" cheese toppings & "+prpperoni_toppings+" pepperoni toppings");
            price = 14+(2*(cheese_toppings+prpperoni_toppings));
        }
        return price;
    }
    public void display(){
        System.out.println();
        double cost = calcCost();
        System.out.println("Your Total cost is: "+cost);
    }

    public void setSize(int S){
        this.size = S;
    }
    public int getSize(){
        return size;
    }
    public void setPrpperoni_toppings(int pt){
        this.prpperoni_toppings = pt;
    }
    public int getPrpperoni_toppings(){
        return prpperoni_toppings;
    }
    public void setCheese_toppings(int ct){
        this.cheese_toppings = ct;
    }
    public int getCheese_toppings(){
        return cheese_toppings;
    }
}
