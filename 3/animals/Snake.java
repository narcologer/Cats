package animals;

import animals.behavior.Run;
import animals.behavior.Voice;
import animals.parent.Carnivorous;
import food.parent.Food;

public class Snake extends Carnivorous implements Voice, Run {
    String voice = "ШШШ";
    public Snake(int hunger, String name, SizeEnum size) {
        super(hunger, name, size);
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public void getVoice() {
        if(this.chkHunger())
            System.out.println(this.voice);
    }

    @Override
    public void setVoice(String voice) {
        this.voice=voice;
    }

    @Override
    public void animalRun() {
        if(this.chkHunger())
            System.out.println("Змея ползет");
    }
}
