public class P040902Z03StatickaFunkcijaRekurzijaPokretanje {

    static int faktorijel(int n) {
        if(n==0 || n==1)
            return 1;
        return n * faktorijel(n-1);
    }

     public static void main(String[] args) {
        int n = 4;
        System.out.println("faktorijel broja " + n + " je " + faktorijel(n));
    }

}
