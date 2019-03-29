package rs.math.oop1.p070102.prevazilazenjePredefinisanog.z02.geometrija;

public class GeometrijskiObjekat {
   public static int brojKreiranih = 0;

   private String oznaka;

   {
      brojKreiranih++;
   }

   public GeometrijskiObjekat(String oznaka) {
      this.oznaka = oznaka;
   }

   public String getOznaka() {
      return oznaka;
   }

   public void setOznaka(String oznaka) {
      this.oznaka = oznaka;
   }

   boolean jeKonveksan() {
      return false; // ovo nikad ne treba da bude izvrseno
   }

   public boolean jeOgranicen() {
      return false; // ovo nikad ne treba da bude izvrseno
   }

   @Override
   public String toString() {
      return oznaka;
   }

}
