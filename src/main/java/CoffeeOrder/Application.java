package CoffeeOrder;

public class Application {
    private OrderCoffeeFrom orderCoffeeFrom;

    public void drawOrderCoffeeFrom() {
        String OSName = System.getProperty("os.name").toLowerCase();
        GUIFactory guiFactory;

        if (OSName.startsWith("win")) {
            guiFactory = new WindowsGUIFactory();
        } else if(OSName.startsWith("mac")) {
            guiFactory = new MacGUIFactory();
        } else {
            System.out.println("Unknown operating system. Cancelling operation. Error code: no-linux-for-you");
            return;
        }
        orderCoffeeFrom = new OrderCoffeeFrom(guiFactory);
    }

    public static void main(String[] args){
        Application application = new Application();
        application.drawOrderCoffeeFrom();
    }
}
