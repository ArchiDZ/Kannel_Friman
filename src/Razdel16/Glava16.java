package Razdel16;

import Tools.Delimetr;

public class Glava16 {
    public static void zadanie_16_1(){
        for(int i = 0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(i+j);
            }
        }
    }

    public static void zadanie_16_2(){
    for (int i = 0;i<4;i++){
        for(int j=0;j<i;j++){
            System.out.print(i*j);
        }
    }
    }
    public static void zadanie_16_3(){
        for (int i =0;i<4;i++){
            int s = 0;
            for (int j = 0; j<i;j++){
                s = s+i+j;
                System.out.print(s+" ");
            }
        }
    }
    public static void zadanie_16_4(){
        for(int i = 1;i<=9;i++){
            System.out.println();
            for(int j = 1;j<=9;j++){
                System.out.print(i*j+" ");
            }
        }
    }
    public static void zadanie_16_5(){
        for(int i = 2;i<=9;i++){
            System.out.println();
            for(int j = 10;j<100;j++) {
                if (j % i == 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }
    public static void zadanie_16_6(){
        String str = "Бюджет 100р, 1 бык - 10р, 1 корова 5р. Сколько вариантов покупки";
        System.out.println(str);
        Delimetr.deleq(str.length());
        for(int i = 10;i<=100;i++){
            for(int j =5;j<100;j++){
                System.out.println();
            }
        }
    }

}
