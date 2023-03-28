package exception03;

public class Lab3 {
    public static void main(String[] args) {
        int[] list = new int[5];
        try{
            System.out.println("Statement1");
            System.out.println(1/0);
            System.out.println("Statement3");
        }
        catch (ArithmeticException ex){

        }
        catch (RuntimeException ex){

        }
        finally {
            System.out.println("Statement4");
        }
        System.out.println("Statement5");
    }
}
