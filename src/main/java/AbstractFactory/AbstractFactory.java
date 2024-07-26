package AbstractFactory;

interface Warrior {}
interface Archer {}

class WarriorWithSword implements Warrior {}
class ArcherWithBow implements Archer {}

class WarriorWithSpears implements Warrior {}
class ArchersWithCrossbow implements Archer {}

interface AbstractFactory {
    Warrior createWarrior(int dmg);
    Archer createArcher(int dmg);
}

class NormalTroopFactory implements AbstractFactory {

    @Override
    public Warrior createWarrior(int dmg) {
        System.out.println("Створився воїн з мечом, його шкода: " + dmg);
        return new WarriorWithSword();
    }

    @Override
    public Archer createArcher(int dmg) {
        System.out.println("Створився лучник, його шкода: " + dmg);
        return new ArcherWithBow();
    }
}

class DifferentTroopFactory implements AbstractFactory {

    @Override
    public Warrior createWarrior(int dmg) {
        System.out.println("Створився воїн з списом, його шкода: " + dmg);
        return new WarriorWithSpears();
    }

    @Override
    public Archer createArcher(int dmg) {
        System.out.println("Створився арбалетчик, його шкода: " + dmg);
        return new ArchersWithCrossbow();
    }
}
