package ExerciseForCoding.Glava1;

public class G1_2 {
    public double z2(int number1,int number2){
        G1_1 obj = new G1_1();
        double chis = obj.minus(number1,number2);
        double znam = 1+ obj.mltply(number1,number2);
        double result = (double) chis/znam;
        return result;
    }
}
