package CoffeeOrder;

public class WindowsGUIFactory implements GUIFactory{
    public WindowsGUIFactory() {
        System.out.println("Створюю графічний інтерефейс для Windows");
    }

    public Button createButton() {
        System.out.println("Створюю кнопку для Windows");
        return new WindowsButton();
    }

    public TextField createTextField() {
        System.out.println("Створюю поле тексту для Windows");
        return new WindowsTextField();
    }

    public Select createSelect() {
        System.out.println("Створюю вибір Windows");
        return new WindowsSelect();
    }
}