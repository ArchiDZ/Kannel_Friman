package Tools;

public class Tool6 {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private  int num5;
    private int num6;

    public void sixDec(int number){
        //123 45
         num1 = number/100000;
         num2 = (number/10000)%10;
         num3 = (number/1000)%10;
         num4 =(number/100)%10;
         num5 = (number%100)/10;
         num6 = number%10;
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

    public int getNum4() {
        return num4;
    }
    public int getNum5(){
        return num5;
    }
    public int getNum6(){
        return num6;
    }
}
