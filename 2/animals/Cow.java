package animals;

import food.Food;

public class Cow extends Herbivore implements Voice, Run{
    String voice = "Му";
    public Cow(int hunger) {
        super(hunger);
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
            System.out.println("Корова бежит");
    }
}
