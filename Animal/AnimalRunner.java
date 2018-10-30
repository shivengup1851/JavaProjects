import java.util.ArrayList;

/**
 * @author (Shiven Gupta)
 */
public class AnimalRunner {
    public static void main(String[] args) {
        //Created a new ArrayList
        ArrayList<Speakable> dogcatList = new ArrayList<Speakable>();
        //Added cat and dog objects
        dogcatList.add(new Dog("Fred"));
        dogcatList.add(new Cat("Wanda"));
        dogcatList.add(new Dog("Tejas"));
        dogcatList.add(new Cat("Karan"));
        dogcatList.add(new Dog("Webbers"));
        dogcatList.add(new Cat("GMACS"));
            for (Speakable obj : dogcatList) {
                obj.speak();
        }
    }
}
