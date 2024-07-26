package CoffeeOrder;

public class MacGUIFactory implements GUIFactory{
    public MacGUIFactory() {
        System.out.println("Створюється графічний інтерфейс для MacOS");
    }

    @Override
    public Button createButton() {
        System.out.println("Створюю кнопку для MacOS");
        return new MacButton();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Створюю поле тексту для MacOS");
        return new MacTextField();
    }

    @Override
    public Select createSelect() {
        System.out.println("Створюю вибір для MacOS");
        return new MacSelect();
    }
}
