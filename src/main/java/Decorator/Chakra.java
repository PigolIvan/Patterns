package Decorator;

public class Chakra extends OptionDecorator{
    public Chakra(Service service){
        super(service, "Характеристика чакри", 500);
    }
}
class Aura extends OptionDecorator{
    public Aura(Service service){
        super(service, "Характеристика аури", 1500);
    }
}
class Channeling extends OptionDecorator{
    public Channeling(Service service){
        super(service, "Запрошення на хто стане мільйонером", 99999);
    }
}
class Avatar extends OptionDecorator{
    public Avatar(Service service){
        super(service, "Ваше кохання в соц мережах", 5555);
    }
}