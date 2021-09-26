package animals;

public class Bear extends Carnivorous{
    public Bear(String voice) {
        super(voice);
    }

    @Override
    public void produceVoice() {
        System.out.println("Медведь: " + this.getVoice());
    }
}
