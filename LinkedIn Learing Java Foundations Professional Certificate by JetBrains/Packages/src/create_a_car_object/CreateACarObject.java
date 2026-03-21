package create_a_car_object;

public class CreateACarObject {

    public static void main(String[] args){

        Car car1 = new Car("Honda","Accor",2024,"blue");

        System.out.println("Car [Make: " + car1.getMake()
                + ", Model: " + car1.getModel()
                + ", Year: " + car1.getYear()
                + ", Color: " + car1.getColor() + "]");
    }
}
