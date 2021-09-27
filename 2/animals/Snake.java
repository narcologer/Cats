package animals;

import food.Food;

public class Snake extends Carnivorous implements Voice{
    String voice = "ШШШ";
    public Snake(int hunger) {
        super(hunger);
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public String getVoice() {
        return this.voice;
    }

    @Override
    public void setVoice(String voice) {
        this.voice=voice;
    }
}
