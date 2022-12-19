public class Guitar implements Instrument{

    public int guitarCord;


    @Override
    public void play() {
        System.out.printf("Играет гитара, с количеством струн %d\n", guitarCord);

    }
}
