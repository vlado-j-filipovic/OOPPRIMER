package rs.math.oop1.p070502.prevazilazenje.z01.stek;

public class ElemenatListe {
   private String sadrzaj;
   private ElemenatListe sledeci;

   public ElemenatListe(String elem) {
      sadrzaj = elem;
      sledeci = null;
   }

   public String getSadrzaj() {
      return sadrzaj;
   }

   public void setSadrzaj(String sadrzaj) {
      this.sadrzaj = sadrzaj;
   }

   public ElemenatListe getSledeci() {
      return sledeci;
   }

   public void setSledeci(ElemenatListe sledeci) {
      this.sledeci = sledeci;
   }

   @Override
   public String toString() {
      return "Elemenat liste: " + sadrzaj;
   }

}
