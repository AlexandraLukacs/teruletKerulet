package teruletkerulet;


public class TeruletKerulet {

    
    public static void main(String[] args) {
        teruletKerulet();
    }

    private static void teruletKerulet() {
        negyzet();
    }

    private static void negyzet() {
        terulet("négyzet", 2);
        kerulet("négyzet", 2, 2);
    }

    private static int terulet(String alakzat, int a) {
        int t = a*a;
        kiir("A "+alakzat+" területe: " + t);
        return t;
    }
    
    private static int terulet(int a, int b) {
        int t = a*b;
        kiir("a téglalap területe: " + t);
        return t;
    }

    private static int kerulet(String alakzat, int a, int b) {
        int k =  2*(a+b);
        kiir("A "+alakzat+" kerülete: "+k);
        return k;
    }

    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }
}
