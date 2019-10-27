package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Camry camry = new Camry(36);
        camry.steer(45);
        System.out.println("===");
        camry.accelerate(30);
        System.out.println("===");
        camry.accelerate(20);
        System.out.println("===");
        camry.accelerate(-42);
    }
}
