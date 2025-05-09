public class Main {
    public static void main(String[] args){
        // creating first object from the car class
        Car car1 = new Car();
        car1.make = "Dodge";
        car1.model = "Ram";
        car1.year = 2021;

        //creating second object from the car class
        Car car2 = new Car();
        car2.make = "Nissan";
        car2.model = "Sentra";
        car2.year = 2012;

        //display information for each object
        car1.displayInfo();
        car2.displayInfo();

    }
}
