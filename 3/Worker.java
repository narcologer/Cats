import animals.parent.Animal;
import animals.behavior.Voice;
import food.parent.Food;

public class Worker {
    public void feed(Animal animal, Food food){
        animal.eat(food);
    }
    public void getVoice(Voice voicedAnimal){
        voicedAnimal.getVoice();
    }
}
