package animals;

import food.Food;

public class Cow extends Herbivore{
    public Cow(String voice) {
        super(voice);
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public void produceVoice() {
        System.out.println("Корова: " + this.getVoice());
    }
}
