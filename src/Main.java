import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Elf elf1 = new Elf("Buddy", "Elfie", 120, 8, "ToyMaker");
        elf1.makeToy();
        elf1.wrapGifts();

        Reindeer reindeer1 = new Reindeer("Dasher", "Dash", 5, 120, "Red");
        reindeer1.fly();
        System.out.println(reindeer1.checkFitnessLevel());

        Child child1 = new Child("Alice", 9);
        child1.addWish("Doll");
        Child child2 = new Child("Bob", 4);
        child2.addWish("Train");

        Santa santa = new Santa("Santa", "Claus", 1000, Arrays.asList(child1, child2));
        System.out.println(santa.checkNaughtyOrNiceList());
        santa.deliverGifts();

        Snowman snowman = new Snowman(5.5, "Red", false);
        snowman.decorate("Scarf");
        snowman.melt();
    }
}
