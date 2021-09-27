import animals.*;
import food.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Worker worker = new Worker();
        Duck duck = new Duck(0);
        Fish fish = new Fish(0);
        worker.getVoice(duck);
        worker.feed(duck, new Grass());
        worker.getVoice(duck);
        worker.feed(fish, new Meat());
        // worker.getVoice(fish); // Не скомпилируется
    }
}
