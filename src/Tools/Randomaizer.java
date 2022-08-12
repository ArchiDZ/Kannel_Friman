package Tools;

import java.util.Random;

public class Randomaizer {
    public static void main(String[] args) {
        Random rnd = new Random();
        int glava = rnd.nextInt(15,22);
        int zadacha;
        switch (glava){
            case (15):
                 zadacha = rnd.nextInt(23,52);
                System.out.printf("-->"+glava+"."+zadacha);
                break;

            case (16):
                 zadacha = rnd.nextInt(1,21);
                System.out.printf("-->"+glava+"."+zadacha);
                break;

            case (17):
                zadacha = rnd.nextInt(1,40);
                System.out.printf("-->"+glava+"."+zadacha);
                break;

            case (18):
                zadacha = rnd.nextInt(1,18);
                System.out.printf("-->"+glava+"."+zadacha);
                break;

            case (19):
                zadacha = rnd.nextInt(1,71);
                System.out.printf("-->"+glava+"."+zadacha);
                break;

            case (20):
                zadacha = rnd.nextInt(1,28);
                System.out.printf("-->"+glava+"."+zadacha);
                break;

            case (21):
                zadacha = rnd.nextInt(1,24);
                System.out.printf("-->"+glava+"."+zadacha);
                break;

            case (22):
                zadacha = rnd.nextInt(1,28);
                System.out.printf("-->"+glava+"."+zadacha);
                break;
        }
    }
}
