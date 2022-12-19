public class Drum implements Instrument {

    public double drumSize;

    @Override
    public void play() {
        System.out.printf("Играет барабан с размером %.2f\n", drumSize);
    }
}
