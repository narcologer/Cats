package animals;

import food.Food;

public class Duck extends Herbivore{
    public Duck(String voice) {
        super(voice);
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public void produceVoice() {
        System.out.println("Утка: " + this.getVoice());
    }
}
