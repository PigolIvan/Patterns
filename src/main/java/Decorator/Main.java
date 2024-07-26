package Decorator;

public class Main {
    public static void main(String[] args) {
        Service Taro = new Divination("Таро", 1000);
        Service Chakra = new Chakra(Taro);
        Service Aura = new Aura(Chakra);

        Service Horoscope = new Horoscope("Гороскоп", 1000);
        Service Channeling = new Channeling(Horoscope);
        Service Avatar = new Avatar(Channeling);

        System.out.println(Aura.getPrice());
        System.out.println(Avatar.getPrice());
    }
}
