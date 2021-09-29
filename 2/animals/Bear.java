package animals;

import food.Food;

public class Bear extends Carnivorous implements Voice, Run{
    String voice = "Ррр";
    public Bear(int hunger) {
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
            System.out.println("Медведь бежит");
    }
}
