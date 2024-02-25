import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Meal {
    private Hamburger hamburger = new Hamburger();
    private Drink drink = new Drink();
    private SideDish sideDish = new SideDish();
    private Toppings toppings = new Toppings();

    public List<String> getListToppingsDeluxe() {
        return listToppingsDeluxe;
    }

    private List<String> listToppingsDeluxe = new ArrayList<>();
    private boolean isDeluxe = false;
    private double totalPrice;

    public Meal() {
    }

    public void deluxeMeal() {
        System.out.print("""
                Do you want to have the deluxe meal!
                It includes:
                    1. A deluxe burger with up to 5 toppings
                    2. Large Coca Cola 
                    3. French Fries
                Everything for 10$.
                """);
        System.out.println("Do you want the deluxe meal: y (Yes) / n (No)");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.equals("y")) { // Use .equals() instead of ==
            this.isDeluxe = true;
            drink.setType("Coca Cola");
            drink.setSize("Large");
            sideDish.setType("French Fries");
            System.out.println("You can choose up to 5 toppings!\n" +
                    "The toppings are:\n" +
                    "a. Extra Meat\n" +
                    "b. Extra Veggies\n" +
                    "c. Extra Sauce\n" +
                    "Please choose one and type (q) when you are done");
            int toppingCounter = 0;
            while (true) {
                try {
                    if (toppingCounter == 5) {
                        System.out.println("You have reached the maximum number of toppings allowed");
                        break;
                    }
                    answer = sc.nextLine();
                    if (answer.equals("q")) { // Use .equals() instead of ==
                        break;
                    }
                    if (answer.equals("a")) { // Use .equals() instead of ==
                        toppings.setType("Extra Meat");
                        this.listToppingsDeluxe.add("Extra Meat");
                        toppingCounter++;
                    } else if (answer.equals("b")) { // Use .equals() instead of ==
                        toppings.setType("Extra Veggies");
                        this.listToppingsDeluxe.add("Extra Veggies");
                        toppingCounter++;
                    } else if (answer.equals("c")) { // Use .equals() instead of ==
                        toppings.setType("Extra Sauce");
                        this.listToppingsDeluxe.add("Extra Sauce");
                        toppingCounter++;
                    }
                } catch (Exception e) {
                    System.out.println(("Please choose a correct option!"));
                    answer = sc.nextLine();
                }

                System.out.println("Topping: " + toppings.getType());
            }
        } else if (answer.equals("n")) { // Use .equals() instead of ==
            System.out.println("Let's build your meal then!");
        }
        this.totalPrice = 10;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void buildAMeal() {
        System.out.println("Let's build your meal!");
        deluxeMeal();
        if (isDeluxe) {
            System.out.print("""
                    -
                    -
                    -
                    """);
            System.out.println("Your final order is:\n" +
                    "Deluxe Burger");
            hamburger.setListToppings(listToppingsDeluxe);
            hamburger.getToppings();
            System.out.println(this.drink.getSize() + " " + this.drink.getType());
            System.out.println(this.sideDish.getType());
            System.out.print("""
                    -
                    -
                    -
                    """);
            System.out.println("Your total price is: " + this.totalPrice + "$");
        } else {
            hamburger.buildHamburger();
            this.totalPrice = hamburger.getTotalPrice();
            drink.chooseDrink();
            this.totalPrice += drink.getPrice();
            sideDish.chooseSideDish();
            this.totalPrice += sideDish.getPrice();
            System.out.print("""
                    -
                    -
                    -
                    """);
            System.out.println("Your final order is:\n" +
                    hamburger.getType() + " " + hamburger.getTotalPrice());
            hamburger.getToppings();
            System.out.println(drink.getSize() + " " + drink.getType() + " " + drink.getPrice());
            System.out.println(sideDish.getType() + " " + sideDish.getPrice());
            System.out.print("""
                    -
                    -
                    -
                    """);
            System.out.println("Your total price is: " + this.totalPrice + "$");
        }
    }
}
