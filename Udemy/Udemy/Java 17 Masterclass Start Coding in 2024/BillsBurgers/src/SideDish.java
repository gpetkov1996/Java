import java.util.Scanner;

public class SideDish {
    private String type;
    private double price;

    public SideDish() {
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public double getPrice() {
        if (this.type == "Rice") {
            this.price = 3;
        } else if (this.type == "French Fries") {
            this.price = 3.5;
        } else if (this.type == "Salad") {
            this.price = 4.5;
        } else if (this.type == "Corn") {
            this.price = 2.25;
        }
        return price;
    }

    public void chooseSideDish() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose your side dish: \n" +
                "a. Rice\n" +
                "b. French Fries\n" +
                "c. Salad\n" +
                "d. Corn");
        String answer = sc.nextLine();
        switch (answer) {
            case "a":
                this.type = "Rice";
                break;
            case "b":
                this.type = "French Fries";
                break;
            case "c":
                this.type = "Salad";
                break;
            case "d":
                this.type = "Corn";
                break;
            default:
                break;
        }
        this.price = getPrice();
        System.out.println("Your Side Dish is: " + this.type);
    }
}
