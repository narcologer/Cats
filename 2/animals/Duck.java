package animals;

import food.Food;

public class Duck extends Herbivore implements Voice{
    String voice = "Кря";
    public Duck(int hunger) {
        super(hunger);
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public String getVoice() {
        if (this.hunger==0)
            return "Покормите утку";
        else
            return this.voice;
    }

    @Override
    public void setVoice(String voice) {
        this.voice=voice;
    }
}
