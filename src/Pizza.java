import java.sql.SQLOutput;

public class Pizza {
    private int price;
    private boolean veg;
    private int cheese = 100;
    private int top =150;
    private int bag = 20;
    private boolean addExCheese;
    private boolean addExTop;
    private boolean takeaway;

    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }
    }
    public void addExtraChees(){
        addExCheese=true;
        this.price+=cheese;
    }
    public void addExtraTop(){
        addExTop=true;
        this.price+=top;
    }
    public void takeaway(){
        takeaway = true;
        this.price+=bag;
    }

    public void Bill(){
        String bill = "";
        if(takeaway){
            bill=bill+"Packaging charges: "+bag+"\n";

        }
        if(addExCheese){
            bill=bill+"Extra Cheese added: "+cheese+"\n";
        }
        if(addExTop){
            bill=bill+"Extra Topping added: "+top+"\n";
        }
        System.out.println(bill);
        System.out.println();

        System.out.println("Grand Total: "+this.price);
        System.out.println("--------------------------------");
        System.out.println("####### Thank You :) #######\n"+"visit Again");
    }
}
