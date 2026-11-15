package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12741s
//        starts at about 3:32:20 — stop at about 3:38:30, at "that's how the toString method works"
// Guide: GUIDE.md in this folder, steps 8–12
//
// Part 17, topic 2 — the toString method
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ToStringMethod.
//    Leave the "package part17;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Car. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Car.java too.

// Creates a class named ToStringMethod.
public class ToStringMethod {
    // psvm start of the program
    public static void main(String[] args) {
        // Creates a new Car object and stores it in the variable car.
        Car car = new Car();
        // Creates a new Car object and stores it in the variable car.
        // Prints the car's make.
        System.out.println(car.make);
        // Prints the car's model.
        System.out.println(car.model);
        // Prints the car's color.
        System.out.println(car.color);
        // Prints the car's year.
        System.out.println(car.year);
        // Prints the Car object, automatically calling its toString() method.
        System.out.println(car);
        // Directly calls and prints the result of the toString() method.
        System.out.println(car.toString());
        // Prints the Car object again using toString().
        System.out.println(car);

    }
}
