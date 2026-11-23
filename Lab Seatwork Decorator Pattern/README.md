# Brewtiful Coffee Shop: Decorator Pattern (Java)

A Java implementation of the **Decorator design pattern** for calculating the cost and listing the ingredients of customized coffee orders at "Brewtiful."

A customer picks a basic coffee, then adds any combination of extras (Milk, Caramel Syrup, and so on). Each extra wraps the order so far and adds its own description and cost.

## Project Structure

| File | Role | Description |
|------|------|-------------|
| `Coffee.java` | Component interface | Declares `getDescription()` and `getCost()` |
| `BlackCoffee.java` | Concrete component | Base coffee: "Black Coffee", ₱100.00 |
| `CoffeeDecorator.java` | Decorator abstraction | Implements `Coffee` and holds the wrapped `Coffee` object |
| `Milk.java` | Concrete decorator | Adds ", Milk" and ₱25.00 |
| `CaramelSyrup.java` | Concrete decorator | Adds ", Caramel Syrup" and ₱40.00 |
| `Main.java` | Demo | Builds sample orders and prints them |

## Expected Output

```
Black Coffee = ₱ 100.00
Black Coffee, Milk = ₱ 125.00
Black Coffee, Milk, Caramel Syrup = ₱ 165.00
Black Coffee, Caramel Syrup, Caramel Syrup, Milk = ₱ 205.00
```