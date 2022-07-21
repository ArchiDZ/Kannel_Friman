package Tools;

public class Tool3 {
    private int num1;
    private int num2;
    private int num3;

    public void threeDec(int number){
        num1 = number/100;
        num2 = (number/10)%10;
        num3 = number%10;
    }
    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }
    public int getNum3(){
        return num3;
    }
}
