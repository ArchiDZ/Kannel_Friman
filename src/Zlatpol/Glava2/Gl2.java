package Zlatpol.Glava2;

import java.util.Random;

public class Gl2 {
    static Random rnd = new Random();

    public static void z_2_1(){
        /*Вычислить значение функции
        *1) Y = 17x^2-6x+13 при любом значении Х
        *2) Y = 3a^2+5a-21 при любом значении А
        * */
        int x = rnd.nextInt(1,10);
        int a = rnd.nextInt(1,10);
        System.out.println("x-->"+x+" a-->"+a);
        int formula1 = 17*(int)Math.pow(x,2)-6*x+13;
        int formula2 = 3*(int)Math.pow(a,2)+5*a-21;
        System.out.println("Результаты ");
        System.out.println("17x^2-6x+13-->"+formula1);
        System.out.println("3a^2+5a-21-->"+formula2);
    }
    public static void z_2_3(){
        /*Составить программу которая вычисляет значение по двум формулам*/
        int a = rnd.nextInt(1,10);
        int x = rnd.nextInt(1,10);
        int formula1 = (int)Math.sqrt(2*a+Math.sin(Math.abs(3*a))/3.56);
        int formula2 = (int)Math.sin((3.2+Math.sqrt(1+x))/Math.abs(5*x));
        System.out.println("a-->"+a+" x-->"+x);
        System.out.println("Результат формулы 1-->"+formula1);
        System.out.println("Результат формулы 2-->"+formula2);
    }

    public static void z_2_4(){
        /*Дана сторона квадрата.Найти его периметр*/
        double storona_kvadrata = rnd.nextDouble(1.0,10.0);
        double perimetr = storona_kvadrata*4;
        System.out.println("Сторона квадрата-->"+storona_kvadrata+" " +
                "Периметр-->"+perimetr);
    }

    public static void z_2_5(){
        /*Дан радиус окружности.Найти Диаметр*/
        double r = rnd.nextDouble(1.0,100.0);
        double D = r*2;
        System.out.println("Радиус окружности-->"+r);
        System.out.println("Диаметр окружности-->"+D);
    }

    public static void z_2_6(){
        /*Считая, что земля идеальная сфера с радиусом R=6350 км, определить
         * расстояние до линии горизонта от точки с заданной высотой над землей*/
        double R = 6350.0;
        double h = rnd.nextDouble(1.0,10.0);
        double formula = Math.pow(R+Math.pow(h,2)-Math.pow(R,2),0.5);
        System.out.println("Растояние до горизонта от точки "+formula+" км");
    }
    public static void z_2_7(){
        /*Дана длинна ребра куба найти площадь боковой поверхности и обьем*/
        double rebro = rnd.nextDouble(2.0,15.0);
        double ploshad = rebro*rebro;
        double objom = rebro*rebro*rebro;
        System.out.println("Ребро куба-->"+rebro);
        System.out.println("Площадь боковой поверхности-->"+ploshad);
        System.out.println("Обьем куба-->"+objom);
    }
    public static void z_2_8(){
        /*Дан радиус окружности.Найти длинну окружности и площадь круга*/
        double r = rnd.nextDouble(2.0,15.0);
        double pi = 3.14;
        double dlinna_okruzh = 2*(pi*r);
        double ploshad_okruzh = Math.pow(pi*r,2);
        System.out.println("Радиус окружности-->"+r);
        System.out.println("Длинна окружности-->"+Math.round(dlinna_okruzh*100.0)/100.0);
        System.out.println("Площадь окружности-->"+Math.round(ploshad_okruzh*100.0)/100.0);
    }
    public static void z_2_9(){
        /*Составить програму для вычисления по формулам
        * 1) 2x^3-3.44xy+2.3x^2-7.1y
        * 2) 3.14(a+b)^3+2.75b^2-12.7a-4.1
        * При любых значениях a b x y
        * */
        double x = Math.round(rnd.nextDouble(1.0,25.0)*100.0)/100.0;
        double y = Math.round(rnd.nextDouble(1.0,25.0)*100.0)/100.0;
        double a = Math.round(rnd.nextDouble(1.0,25.0)*100.0)/100.0;
        double b = Math.round(rnd.nextDouble(1.0,25.0)*100.0)/100.0;

        double formula1 = Math.pow(2*x,3)-3.44*x*y+Math.pow(2.3*x,2)-7.1*y;
        double formula2 = 3.14*Math.pow(a+b,3)+2.75*Math.pow(b,2)-12.7*a-4.1;

        System.out.println("x-->"+x+" y-->"+y+" a-->"+a+" b-->"+b);
        System.out.println("2x^3-3.44xy+2.3x^2-7.1y-->"+Math.round(formula1*100.0)/100.0);
        System.out.println("3.14(a+b)^3+2.75b^2-12.7a-4.1-->"+Math.round(formula2*100.0)/100.0);
    }
    public static void z_2_10(){
        /*Даны два целых числа.Найти:
        * -их среднее арифметическое
        * --их среднее геометрическое*/
        int num1 = rnd.nextInt(1,1000);
        int num2 = rnd.nextInt(1,1000);
        int avg = (num1+num2)/2;
        int geo_avg = (int)Math.sqrt(num1*num2);
        System.out.println("Число 1-->"+num1+" Число 2-->"+num2);
        System.out.println("Среднее арифметическое-->"+avg);
        System.out.println("Среднее геометрическое-->"+geo_avg);
    }
    public static void z_2_11(){
        /*Известны обьем и масса тела. Определить плотность материала этого тела*/
        int objom = rnd.nextInt(2,25);
        int ves = rnd.nextInt(1,30);
        int plotnost = ves/objom;
        System.out.println("Вес тела-->"+ves);
        System.out.println("Обьем тела-->"+objom);
        System.out.println("Плотность -->"+plotnost);
    }
    public static void z_2_12(){
        /*Известно количество жителей в госусдарстве и площадь его террмтории.
        * Определить плотность населения в этом государстве*/
        int chisl_zhit = rnd.nextInt(2,100000);
        int plosh_gosudarstva = 95159;
        double plotnost_naselenia = (double) chisl_zhit/plosh_gosudarstva;
        System.out.println("Число постоянных жителей в стране-->"+chisl_zhit);
        System.out.println("Площадь государства-->"+plosh_gosudarstva);
        System.out.println("Плотность населения-->"+plotnost_naselenia);

    }
    public static void z_2_13(){
        /*Составить программу решения линейного уравнения
        * ax+b=0 a!=0*/
        int a = rnd.nextInt(1,10);
        int b = rnd.nextInt(1,10);
        double x = (double) -b/a;
        System.out.println(a+"x+"+b+"=0");
        System.out.println("Х="+x);
    }
    public static void z_2_14(){

    }


    public static double z_2_31(int kon, int apl){
        double kon_price = 75.85;
        double apl_price = 139.2;

        double summ = (kon*kon_price)+(apl*apl_price);
        return summ;
    }
    public static int z_2_32(int quanti){
        int pc_price = 162999;
        int monitor_price = 141999;
        int mouse_keyboard_price = 24999;
        int summ = (pc_price+monitor_price+mouse_keyboard_price)*quanti;
        return summ;
    }

    public static void z_2_33(){
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
