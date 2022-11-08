package experiment;

import java.util.Random;

public class Person {
    static Random rnd = new Random();
    private static String [] race = {"Человек","Орк","Улитка","Гусь"};
    private static String [] op_race = {"большой","грязный","сильный","вонючий",
            "пупырчитый","свирепый","лопоухий","слюнявый","красивый","вислощекий"};

    public static void genPerson(int qua){
        for (int i=1;i<qua;i++){
            int race_random = rnd.nextInt(0, race.length);
            int op_race_random = rnd.nextInt(0, op_race.length);
            String str = op_race[op_race_random]+" "+race[race_random];
            System.out.println(str);
        }
    }
}


