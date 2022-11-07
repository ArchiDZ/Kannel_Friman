package Zlatpol.Glava2;

import java.util.Random;

public class Glava2 {
    static Random rnd = new Random();

    public static double zadacha_2_31(int kon, int apl){
        double kon_price = 75.85;
        double apl_price = 139.2;

        double summ = (kon*kon_price)+(apl*apl_price);
        return summ;
    }
    public static int zadacha_2_32(int quanti){
        int pc_price = 162999;
        int monitor_price = 141999;
        int mouse_keyboard_price = 24999;
        int summ = (pc_price+monitor_price+mouse_keyboard_price)*quanti;
        return summ;
    }

    public static void zadacha_2_33(){
        int age_tanya = 12;
        int age_dima = 8;
        int avarage_age = (age_tanya+age_dima)/2;
        System.out.println("Возраст Тани "+age_tanya+" лет");
        System.out.println("Возраст Димы "+age_dima+ " лет");
        System.out.println("Средний возраст детей "+avarage_age);
    }

    public static void zadacha_2_36(){

    }

}
