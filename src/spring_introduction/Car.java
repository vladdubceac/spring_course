package spring_introduction;

class Car {
    void run() {
        System.out.println("car is running");
    }
}

class Audi extends Car {
    public static void main(String args[]) {
        Car b = new Audi();    //upcasting
        b.run();
        b = new Car();
        b.run();
        Audi a = new Audi();
        a.run();
    }

    void run() {
        System.out.println("Audi is running safely with 100km");
    }
}