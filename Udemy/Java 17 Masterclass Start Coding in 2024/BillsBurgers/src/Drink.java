import java.util.Scanner;

public class Drink {
    private String size;
    private String type;
    private double price;

    public Drink() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        if (this.type == "Water") {
            if (this.size == "Large") {
                this.price = 1.5;
            } else if (this.size == "Medium") {
                this.price = 0.8;
            } else if (this.size == "Small") {
                this.price = 0.5;
            }
        } else if (this.type == "Coca Cola") {
            if (this.size == "Large") {
                this.price = 5;
            } else if (this.size == "Medium") {
                this.price = 3;
            } else if (this.size == "Small") {
                this.price = 1.5;
            }
        } else if (this.type == "Cold Tea") {
            if (this.size == "Large") {
                this.price = 4.5;
            } else if (this.size == "Medium") {
                this.price = 2.5;
            } else if (this.size == "Small") {
                this.price = 1.25;
            }
        }
        return price;
    }

    public void chooseDrink() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose your drink: \n" +
                "a. Water\n" +
                "b. Coca Cola\n" +
                "c. Cold Tea");
        String answer = sc.nextLine();
        boolean isCorrectDrink = false;
        while (!isCorrectDrink) {
            if(answer.equals("a") || answer.equals("b") || answer.equals("c")) {
                isCorrectDrink = true;
            } else {
                System.out.println("Please choose your drink using a correct option: \n" +
                        "a. Water\n" +
                        "b. Coca Cola\n" +
                        "c. Cold Tea");
                answer = sc.nextLine();
            }
        }
        switch (answer) {
            case "a":
                this.type = "Water";
                break;
            case "b":
                this.type = "Coca Cola";
                break;
            case "c":
                this.type = "Cold Tea";
                break;
            default:
                break;
        }
        System.out.println("Now choose the size of your drink:\n" +
                "a. Large\n" +
                "b. Medium\n" +
                "c. Small");
        answer = sc.nextLine();
        boolean isCorrectSize = false;
        while (!isCorrectSize) {
            if(answer.equals("a") || answer.equals("b") || answer.equals("c")) {
                isCorrectSize = true;
            } else {
                System.out.println("Please choose your drink using a correct option: \n" +
                        "a. Water\n" +
                        "b. Coca Cola\n" +
                        "c. Cold Tea");
                answer = sc.nextLine();
            }
        }
        switch (answer) {
            case "a":
                this.size = "Large";
                break;
            case "b":
                this.size = "Medium";
                break;
            case "c":
                this.size = "Small";
                break;
            default:
                break;
        }
        this.price = getPrice();
        System.out.println("Your drink: " + this.size + this.type);
    }
}
