import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Guitar guitar = new Guitar();
        guitar.guitarCord = 6;
        Drum drum = new Drum();
        drum.drumSize = 33.5;
        Trumpet trumpet = new Trumpet();
        trumpet.trumpetDia = 12;
        Instrument[] instruments = new Instrument[]{guitar, drum, trumpet};

        for(Instrument a: instruments){
            a.play();
            System.out.println("---------------------");
        }
    }
}