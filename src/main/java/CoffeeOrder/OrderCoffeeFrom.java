package CoffeeOrder;

public class OrderCoffeeFrom {
    private final TextField customerNameTextField;
    private final Select coffeeTypeSelect;
    private final Button orderButton;

    public OrderCoffeeFrom(GUIFactory factory){
        System.out.println("Створюю форму замовлення кави");
        customerNameTextField = factory.createTextField();
        coffeeTypeSelect = factory.createSelect();
        orderButton = factory.createButton();
    }
}
