import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hamburger {
    private String type;
    private double basePrice = 5;
    private double totalPrice;
    private Toppings toppings = new Toppings();

    public void setListToppings(List<String> listToppings) {
        this.listToppings = listToppings;
    }

    public List<String> getListToppings() {
        return listToppings;
    }

    private List<String> listToppings = new ArrayList<>();

    public Hamburger() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice() {

        return totalPrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void getToppings() {
        if (listToppings.isEmpty()) {
            System.out.println("No extra toppings");
        } else {
            for(String topping: this.listToppings) {
                toppings.setType(topping);
                System.out.println(topping + " " + toppings.getPrice());
            }
        }
    }

    public void buildHamburger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose your burger: \n" +
                "a. Normal \n" +
                "b. Veggie Burger \n" +
                "c. Chicken Burger \n" +
                "d. BBQ Burger");
        String answer = sc.nextLine();
        boolean isCorrectOption = false;
        while (!isCorrectOption) {
            if(answer.equals("a") || answer.equals("b") || answer.equals("c") || answer.equals("d")) {
                isCorrectOption = true;
            } else {
                System.out.println("Please choose your burger using a correct option: \n" +
                        "a. Normal \n" +
                        "b. Veggie Burger \n" +
                        "c. Chicken Burger \n" +
                        "d. BBQ Burger");
                answer = sc.nextLine();
            }
        }

        switch (answer) {
            case "a":
                this.totalPrice = basePrice;
                this.type = "Normal";
                break;
            case "b":
                this.totalPrice = basePrice + 2;
                this.type = "Veggie Burger";
                break;
            case "c":
                this.totalPrice = basePrice + 3;
                this.type = "Chicken Burger";
                break;
            case "d":
                this.totalPrice = basePrice + 5;
                this.type = "BBQ Burger";
                break;
            default:
                break;
        }

        System.out.println("Do you want toppings: y (Yes) / n (No)");
        answer = sc.nextLine();
        if (answer.equals("y")) { // Use .equals() instead of ==
            System.out.println("You can choose up to 3 toppings!\n" +
                    "The toppings are:\n" +
                    "a. Extra Meat\n" +
                    "b. Extra Veggies\n" +
                    "c. Extra Sauce\n" +
                    "Please choose one and type (q) when you are done");

            int toppingCounter = 0;
            while (true) {
                if (toppingCounter == 3) {
                    System.out.println("You have reached the maximum number of toppings allowed");
                    break;
                }
                answer = sc.nextLine();
                boolean isCorrectTopping = false;
                while (!isCorrectTopping) {
                    if(answer.equals("a") || answer.equals("b") || answer.equals("c") || answer.equals("q")) {
                        isCorrectTopping = true;
                    } else {
                        System.out.println("Please choose your topping using a correct option: \n" +
                                "a. Extra Meat\n" +
                                "b. Extra Veggies\n" +
                                "c. Extra Sauce\n" +
                                "Please choose one and type (q) when you are done");
                        answer = sc.nextLine();
                    }
                }
                if (answer.equals("q")) { // Use .equals() instead of ==
                    break;
                }
                if (answer.equals("a")) { // Use .equals() instead of ==
                    this.toppings.setType("Extra Meat");
                    this.listToppings.add("Extra Meat");
                    this.totalPrice += toppings.getPrice();
                    toppingCounter++;
                } else if (answer.equals("b")) { // Use .equals() instead of ==
                    this.toppings.setType("Extra Veggies");
                    this.listToppings.add("Extra Veggies");
                    this.totalPrice += toppings.getPrice();
                    toppingCounter++;
                } else if (answer.equals("c")) { // Use .equals() instead of ==
                    this.toppings.setType("Extra Sauce");
                    this.listToppings.add("Extra Sauce");
                    this.totalPrice += toppings.getPrice();
                    toppingCounter++;
                }
                System.out.println("Topping: " +  this.toppings.getType());
            }
        } else if (answer.equals("n")) { // Use .equals() instead of ==
            System.out.println("No added toppings");
        }

    }
}
