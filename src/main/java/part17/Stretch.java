package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12528s
//        rewatch from about 3:28:50 if you forget how overloaded constructors work,
//        and from about 3:35:20 for toString
// Guide: GUIDE.md in this folder, steps 4–12
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B2 and B3 also change your Pizza and Car classes.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {

        part17.Pizza a = new part17.Pizza("flatbread", "pesto");
        part17.Pizza b = new part17.Pizza("thin crust", "tomato", "cheddar", "olives");
        part17.Pizza c = new part17.Pizza();
        // system prints red
        System.out.println(a.cheese);
        // prints olives
        System.out.println(b.topping);
        //prints null
        System.out.println(c.bread);
        Car car = new Car();
        // system prints Ford
        System.out.println(car);
        part17.Pizza mine = new part17.Pizza("thin crust", "tomato", "cheddar", "olives");
        System.out.println(mine);
        Car other = new Car("Toyota", "Corolla", "blue", 2018);
        System.out.println(other);


        //B1.
        String make = "Honda";
        String model = "Civic";
        int year = 2019;
        String description = year + " " + make + " " + model;
        System.out.println(description);
    }

    //B2.

    }

