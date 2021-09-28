package animals;

import food.Food;

public class Duck extends Herbivore implements Voice, Run, Swim, Fly{
    String voice = "Кря";
    public Duck(int hunger) {
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
    public void animalFly() {
        if(this.chkHunger())
            System.out.println("Утка летит");
    }

    @Override
    public void animalRun() {
        if(this.chkHunger())
            System.out.println("Утка бежит");
    }

    @Override
    public void animalSwim() {
        if(this.chkHunger())
            System.out.println("Утка плывет");
    }
}
