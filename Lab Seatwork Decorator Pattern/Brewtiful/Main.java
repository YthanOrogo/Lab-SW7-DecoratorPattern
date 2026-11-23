public class Main {
    public static void main(String[] args) {
        // Plain black coffee
        Coffee order1 = new BlackCoffee();
        print(order1);

        // Black coffee + Milk
        Coffee order2 = new Milk(new BlackCoffee());
        print(order2);

        // Black coffee + Milk + Caramel Syrup
        Coffee order3 = new CaramelSyrup(new Milk(new BlackCoffee()));
        print(order3);

        // Black coffee + double Caramel Syrup + Milk
        Coffee order4 = new Milk(new CaramelSyrup(new CaramelSyrup(new BlackCoffee())));
        print(order4);
    }

    private static void print(Coffee coffee) {
        System.out.printf("%s = ₱ %.2f%n", coffee.getDescription(), coffee.getCost());
    }
}
