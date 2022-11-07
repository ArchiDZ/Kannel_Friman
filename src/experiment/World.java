package experiment;

import java.util.Random;

public class World {
    static Random rnd = new Random();
    private static String [] world = {"Пустыня","Болото","Лес"};
    private static String [] op_desert = {"бескрайнюю","безжизненую","жаркую"};
    private static String [] op_swamp = {"вонючае","жуткое","запрелое"};
    private static String [] op_forest = {"темный","непроходимый","жуткий"};

    public static void wGen(){
        int numOfWorld = rnd.nextInt(0,world.length);
    String str1 = "Вы открываете глаза и видите перед собой ";

}
}
