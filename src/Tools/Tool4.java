package Tools;

public class Tool4 {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int centrNumber ;

    public void fourDec(int number){
        //1234
        num1 = number/1000;
        num2 = (number/100)%10;
        num3 =(number/10)%10;
        num4 = number%10;
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

    public int getCentralNum(int number){
        centrNumber = (number%1000)/100;
        return centrNumber;
    }
}
