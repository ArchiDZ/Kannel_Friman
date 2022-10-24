package BookKannnel.Razdel1.Razdel19;

import java.util.Random;

public class Zadanie19_1 {
    public static int makenumber(int n,int k){
        Random rnd = new Random();
int num = rnd.nextInt(0,10);
int i = rnd.nextInt(0,10);
while (i<=n){
    num=num*10+k;
    i=i+1;
}
        return num;
    }
}
