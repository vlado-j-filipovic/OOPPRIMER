/*

Написати Јава програм који пребројава елементе у низу бројева из интервала 
који није унапред задат и приказује их у бројчаном облику и у облику хистограма.
  
Програм је реализован као један метод main.
   
 */

// Програм илуструје рад са истовремену декларацију и иницијализацију низа,
// колекцијску петљу, обичнан и форматизован испис података на стандардни излаз
// и коришћење излазних секвенци приликом исписа.

package rs.math.oop1.p050300.jednodimenzionalniNiz.z02.frekvencijeMonolitno;

public class FrekfencijeBrojeva {

   public static void main(String[] args) {
      int[] rezultati =
      { -1, 7, 3, 4, 9, 7, 6, 3, 10, 5, 6, 8, 8, 8, 4, 3, 3, 3, 2, 5, 7,
               9, 1, 10, 2, 2, 2, 2, 2 , 8};
      System.out.println("Niz brojeva:");
      for (int x : rezultati)
         System.out.printf("%4d", x);
      // odredi granice
      int donjaGranica = rezultati[0];
      int gornjaGranica = rezultati[0];
      for(int i=1; i<rezultati.length; i++)
      {
         if( rezultati[i]< donjaGranica)
            donjaGranica = rezultati[i];
         if( rezultati[i]> gornjaGranica)
            gornjaGranica = rezultati[i];
      }  
      int[] brojPojava = new int[gornjaGranica-donjaGranica+1];
      // inicijalizacija
      for (int i = 0; i < brojPojava.length; i++)
         brojPojava[i] = 0;
      // izracunavanje
      for (int x : rezultati)
         brojPojava[x-donjaGranica]++;
      // numericki prikaz
      System.out.println(
               "\nBroj pojava (numericki prikaz):");
      for (int i = 0; i < brojPojava.length; i++)
         System.out.printf("%d:%d %s", (i + donjaGranica),
                  brojPojava[i],
                  ((i + 1) % 8 == 0) ? "\n" : "\t");
      // histogram
      System.out.println("\nBroj pojava (histogram):");
      for (int i = 0; i < brojPojava.length; i++) {
         System.out.printf("%3d:", i + donjaGranica);
         for (int j = 0; j < brojPojava[i]; j++)
            System.out.print("#");
         System.out.println();
      }
   }
}
