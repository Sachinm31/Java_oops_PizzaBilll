public class DeluxPizza extends Pizza {

    public DeluxPizza(boolean veg) {
        super(veg);
        super.addExtraChees();
        super.addExtraTop();
        super.takeaway();
    }
}
