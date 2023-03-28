package exception03;

public class Lab6 {
    public static void main(String[] args) {
        int[] list = new int[5];
        try{
            System.out.println("List[5] is " + list[5]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println(ex.getMessage());
//            System.out.println(ex.toString());
//            ex.printStackTrace();
            StackTraceElement[] s = ex.getStackTrace();
            for (int i = 0;i < s.length ; i++){
                System.out.println(s[i].getClassName());
                System.out.println(s[i].getMethodName());
                System.out.println(s[i].getFileName());
                System.out.println(s[i].getLineNumber());
            }
        }
    }
}
