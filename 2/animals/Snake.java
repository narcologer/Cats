package animals;

public class Snake extends Carnivorous{
    public Snake(String voice) {
        super(voice);
    }

    @Override
    public void produceVoice() {
        System.out.println("Змея: " + this.getVoice());
    }
}
