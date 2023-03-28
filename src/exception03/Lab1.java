package exception03;

public class Lab1 {
    public static void main(String[] args) {
        Testa();
        Testb();
        Testc();
        Testd();
        Teste();
        Testf();
    }
    static void Testa(){
        System.out.println(1/0);
    }
    static void Testb(){
        int[] list = new int[5];
        System.out.println(list[5]);
    }
    static void Testc(){
        String s = "abc";
        System.out.println(s.charAt(3));
    }
    static void Testd(){
        Object o = new Object();
        String d = (String) o;
    }
    static void Teste(){
        Object o = null;
        System.out.println(o.toString());
    }
    static void Testf(){
        System.out.println(1.0 / 0);
    }
}
