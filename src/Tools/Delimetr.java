package Tools;

public class Delimetr {
    //Разделитель как равно
    public static void deleq(int n){
        for(int i=1;i<=n;i++){
            System.out.print("=");
        }
        System.out.println();
    }
//Разделитель как минус
    public static void delmin(int n){
        System.out.println();
        for(int i=1;i<=n;i++){
            System.out.print("-");
        }
        System.out.println();
    }
    //Разделитель как шарп
    public static void delsharp(int n){
       // System.out.println();
        for (int i=1;i<=n;i++){
            System.out.print("#");
        }
         System.out.println();
    }
}
