package animals;

import food.Food;

public class Echidna extends Herbivore{
    public Echidna(String voice) {
        super(voice);
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public String getVoice() {
        throw new NullPointerException();
    }

    @Override
    public void produceVoice() {
        this.getVoice();
    }
}
