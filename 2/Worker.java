import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker {
    public void feed(Animal animal, Food food){
        animal.eat(food);
    }
    public void getVoice(Voice voicedAnimal){
        System.out.println(voicedAnimal.getVoice());
    }
}
