import animals.*;
import food.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    Worker worker = new Worker();
        Animal [] animals = {new Duck("Кря"), new Echidna(null), new Cow("Муу"), new Fish(null),
                new Bear("Ррр"),new Snake("ШШШ")};
        while (true){
            worker.animalOutput(animals);
            System.out.println("Введите номер животного:");
            int ch =in.nextInt();
            if ((ch>animals.length-1)||(ch<0))
                System.out.println("Нет такого животного");
            else
            {
                System.out.println("1 - покормить животное, 2 - голос животного (рыба и ехидна вызовут исключение)");
                int act =in.nextInt();
                switch (act){
                    case 1: {
                        System.out.println("1 - травой, 2 - мясом");
                        int foodId = in.nextInt();
                        switch (foodId){
                            case 1:
                                worker.feed(animals[ch], new Grass());
                                break;
                            case 2:
                                worker.feed(animals[ch], new Meat());
                                break;
                            default:
                                System.out.println("Нет такой еды");
                                break;
                        }
                    }
                    break;
                    case 2:
                        worker.getVoice(animals[ch]);
                        break;
                    default:
                        System.out.println("Нет такого действия (возможно будет в будущих патчах)");
                        break;
                }

            }
        }
    }
}
