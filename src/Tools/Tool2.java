package Tools;

public class Tool2 {

    private int num1;
    private int num2;

    public void twoDec(int number){
        this.num1 = num1;
        this.num2 = num2;
         num1 = number/10;
         num2 = number%10;
    }
    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }

    public static int sumOfTwoDigits (int numFromArray){
        int num1 = numFromArray/10;
        int num2 = numFromArray%10;
        int result = num1+num2;
        return result;
    }
}
