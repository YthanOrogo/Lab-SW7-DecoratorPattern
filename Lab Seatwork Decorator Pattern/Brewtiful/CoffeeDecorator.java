public abstract class CoffeeDecorator implements Coffee {
    private final Coffee wrappedCoffee;

    public CoffeeDecorator(Coffee wrappedCoffee) {
        this.wrappedCoffee = wrappedCoffee;
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost();
    }
}
