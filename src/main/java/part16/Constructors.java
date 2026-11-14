package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        starts at about 3:10:07 — stop at about 3:19:32, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 16, video 1 — constructors
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called Constructors.
//    Leave the "package part16;" line and the "public class Constructors" line alone.
//    He also has a second class called Human. YOU make that file too:
//    right-click the part16 folder -> New -> Java Class -> type Human -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in Human.java, saying in YOUR OWN WORDS what that line does.

// Creates a class named Constructors.
public class Constructors {
    // The main method where the program starts running.
    public static void main(String[] args) {
        // Creates a Human object named human1 and passes Rick's information to the constructor.
        Human human1 = new Human("Rick", 65, 70);
        // Creates another Human object named human2 and passes Morty's information to the constructor.
        Human human2 = new Human ("Morty", 16, 50);
        // Prints the name stored in the human1 object (Rick).
        System.out.println(human1.name);
        // Prints the name stored in the human2 object (Morty).
        System.out.println(human2.name);
        // Calls the eat() method for the human1 object.
        human1.eat();
        // Calls the drink() method for the human2 object.
        human2.drink();
    }

}




