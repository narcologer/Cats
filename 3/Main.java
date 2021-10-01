import animals.*;
import animals.parent.Carnivorous;
import animals.parent.Herbivore;
import food.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Worker worker = new Worker();
        Duck duck = new Duck(0,"Фараон", SizeEnum.MEDIUM);
        Fish fish = new Fish(0, "Наутилус", SizeEnum.MEDIUM);
        Echidna echidna = new Echidna(1,"Уицилапочтли", SizeEnum.MEDIUM);
        Bear bear = new Bear(2, "Генерал", SizeEnum.BIG);
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
        Voliere<Herbivore> voliere = new Voliere(SizeEnum.MEDIUM);
        voliere.addAnimal(duck);
        voliere.addAnimal(echidna);
        voliere.removeAnimal("Фараон");
        // voliere.addAnimal(bear); // Не скомпилируется
        // bear.animalFly();    // Не скомпилируется
        // worker.getVoice(fish); // Не скомпилируется
    }
}
