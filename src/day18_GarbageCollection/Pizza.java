package day18_GarbageCollection;

public class Pizza {

    public char size;
    public int numberOfCheeseToppings, numberOfPepperoniTopping;
    // calculate the total of the pizza price, returns it as double
    public double calCost() {
        double totalPrice = 0;
        switch (size) {
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseToppings * numberOfPepperoniTopping);
                break;
                case 'M':
                    case 'm':
                        totalPrice = 12 + 2 * (numberOfCheeseToppings * numberOfPepperoniTopping);
                        break;

                        case 'L':
                            case 'l':
                                totalPrice = 14 + 2 * (numberOfCheeseToppings * numberOfPepperoniTopping);
                                break;

                           default:
                               System.out.println("Invalid size" +size);
        }

        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price =" +calCost() +
                '}';
    }
}
/*
1. Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping

			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping
 */