package AbstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args){
        NormalTroopFactory normalTroopFactory = new NormalTroopFactory();
        DifferentTroopFactory differentTroopFactory = new DifferentTroopFactory();
        normalTroopFactory.createArcher(30);
        normalTroopFactory.createWarrior(45);
        differentTroopFactory.createWarrior(40);
        differentTroopFactory.createArcher(50);
    }
}
