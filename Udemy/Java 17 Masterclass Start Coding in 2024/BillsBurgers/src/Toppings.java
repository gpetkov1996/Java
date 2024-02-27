public class Toppings {
    private String type;
    private double price;

    public Toppings() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        if (this.type == "Extra Meat") {
            this.price = 0.50;
        } else if (this.type == "Extra Veggies") {
            this.price = 0.25;
        } else if (this.type == "Extra Sauce") {
            this.price = 0.10;
        }
        return price;
    }
}
