package animals;

import food.Food;
import food.Grass;

abstract class Carnivorous implements Animal {
    private int hunger;
    private String voice;

    protected Carnivorous(String voice) {
        this.hunger = 1;
        this.voice = voice;
    }

    public void eat(Food food){
        if (food instanceof Grass)
        {
            System.out.println("Хищники не едят травы");
        }
        else
        {
            this.hunger++;
            System.out.println(this.getClass().getName()+" съел "+food.getClass().getName()+". ");
        }
    }

    public String getVoice(){
        if (this.hunger==0)
            return ("Покормите животное");
        else {
            this.hunger--;
            return this.voice;
        }
    }

    public int getHunger() {
        return hunger;
    }

    public abstract void produceVoice();
}
