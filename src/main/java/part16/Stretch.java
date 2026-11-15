package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        rewatch 3:10:07–3:19:32 for constructors and "this",
//        3:19:50–3:25:04 for local and global variables
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// Your extra classes (Counter, Pet, Broken) go in THIS file,
// BELOW the last } of class Stretch, without the word public.

public class Stretch {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.show();
        c.count = 20;
        c.show();
        Counter.Pet pet1 = new Counter.Pet("Max", 3);
        Counter.Pet pet2 = new Counter.Pet("Luna", 5);
        pet1.speak();
        pet2.speak();
        Broken broken = new Broken("Max", 3);
        System.out.println(broken.name + " " + broken.age);


    }

    static class Counter {
        int count = 10;

        void show() {
            //  count = 3
            int count = 3;
            // system outputs 10 because it is the global count
            System.out.println(count);
            // system outputs 20 because this is the global count which is 10 but then c.count = 20 so the global count becomes 20.
            System.out.println(this.count);
        }

        //B1.
        static class Pet {
            String name;
            int age;

            Pet(String name, int age) {
                this.name = name;
                this.age = age;
            }

            void speak() {
                System.out.println(name + " is " + age + " years old");
            }
            //B2.
            public void birthday() {
                age++;
                System.out.println("Happy birthday, " + name + "!");
        }
    }

    }
    static class Broken {
        String name;
        int age;

        Broken(String name, int age) {
            name = name;
            this.age = age;
            // the variable was never assinged a value
        }
    }
}




