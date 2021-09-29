import animals.*;
import food.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Worker worker = new Worker();
        Duck duck = new Duck(0);
        Fish fish = new Fish(0);
        Bear bear = new Bear(2);
        worker.getVoice(bear);
        bear.animalRun();
        bear.animalRun();
        worker.getVoice(duck);
        worker.feed(duck, new Grass());
        worker.getVoice(duck);
        worker.feed(fish, new Meat());
        fish.animalSwim();
        duck.animalFly();
        worker.feed(bear, new Meat());
        // bear.animalFly();    // Не скомпилируется
        // worker.getVoice(fish); // Не скомпилируется
    }
}
