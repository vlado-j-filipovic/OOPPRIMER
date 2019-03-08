
/*

Класа за реализацију стека који садржи ниске.

Стек се реализује преко једноструко повезане листе. 

Стек може да расте по потреби.
 
 */

package rs.math.oop1.zd.p070300.apstraktneKlase.z04.stek;

public class StekNiskiPrekoListe extends StekNiski {

   private PovezanaLista elementi = new PovezanaLista();

   public void push(String elem) {
      elementi.dodajElemenatNaPocetak(elem);
   }

   public String pop() {
      String elem = elementi.ukloniElemenatSaPocetka();
      if (elem == null) {
         System.out.println("Greska POP: Stek je prazan!");
         return "<nema>";
      }
      return elem;
   }

   public int brojElemenata() {
     return elementi.broj();
   }
}
