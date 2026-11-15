package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        starts at about 3:50:00 — stop at about 3:57:15, at "that's the basics of the static keyword"
// Guide: GUIDE.md in this folder, steps 1–9
//
// Part 19 — the static keyword
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StaticKeyword.
//    Leave the "package part19;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Friend. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Friend.java too.

public class StaticKeyword {
    public static void main(String[] args) {
        // Prints the initial value of the static variable numberOfFriends before any objects are created (outputs 0)
        System.out.println(Friend.numberOfFriends);
        // Instantiates a new Friend object with the name "SpongeBob", which triggers the constructor and increments numberOfFriends
        Friend friend1 = new Friend("SpongeBob");
        // Prints the updated count of friends after creating the first friend (outputs 1)
        System.out.println(Friend.numberOfFriends);
        // Instantiates a second Friend object named "Patrick", incrementing the shared static counter
        Friend friend2 = new Friend("Patrick");
        // Prints the updated count of friends after creating the second friend (outputs 2)
        System.out.println(Friend.numberOfFriends);
        // Instantiates a third Friend object named "Squidward", incrementing the static counter again
        Friend friend3 = new Friend("Squidward");
        // Prints the static variable numberOfFriends using the class name (outputs 3)
        System.out.println(Friend.numberOfFriends);
        // Prints the static variable numberOfFriends using an instance reference (discouraged style, but valid in Java; outputs 3)
        System.out.println(friend1.numberOfFriends);
        // Invokes the static method displayFriends() to print or handle all friend instances created up to this point
        Friend.displayFriends();
        // Instantiates a fourth Friend object named "Sandy", incrementing the static counter to 4
        Friend friend4 = new Friend("Sandy");
        // Invokes displayFriends() again to show the updated collection including Sandy
        Friend.displayFriends();
        // Uses Java's built-in Math class static method round() to round 3.14 to the nearest integer (outputs 3)
        System.out.println(Math.round(3.14));
    }
}
