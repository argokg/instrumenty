public class Trumpet implements Instrument{
    public double trumpetDia;

    @Override
    public void play() {
        System.out.printf("Играет труба с размером %.2f\n", trumpetDia);
    }
}
