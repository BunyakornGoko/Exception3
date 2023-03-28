package exception03;

public class throwtest {
    public static void main(String[] args) {
        System.out.println(quotient(5,0));
    }
    public static int quotient(int number1 , int number2){
        if(number2 == 0){
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return number1/number2;
    }

}
