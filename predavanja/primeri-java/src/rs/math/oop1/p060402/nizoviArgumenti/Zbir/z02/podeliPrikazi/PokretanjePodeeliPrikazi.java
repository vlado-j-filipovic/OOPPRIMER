package rs.math.oop1.p060402.nizoviArgumenti.Zbir.z02.podeliPrikazi;

public class PokretanjePodeeliPrikazi {

    static void prikaziPodeljene(int delilac, int... a) {
        for(int x: a)
            System.out.print( (double)x/delilac + " " );
        System.out.println();
    }

    public static void main(String[] args) {
        prikaziPodeljene(2, 3);
        prikaziPodeljene(2, 3, 4);
        prikaziPodeljene(2, 3, 4, 5);
        prikaziPodeljene(2 );
        int[] a = {3,4,5,6};
        prikaziPodeljene(2,a);
    }

}
