import animals.*;
import food.*;

public class Main {

    public static void main(String[] args) {
	    Worker worker = new Worker();
        Duck duck = new Duck("Кря");
        Fish fish = new Fish(null);
        worker.feed(duck,new Grass());
        System.out.println(duck.getHunger());
        worker.getVoice(duck);
        System.out.println(duck.getHunger());
        worker.feed(fish,new Meat());
        worker.getVoice(fish);
    }
}
