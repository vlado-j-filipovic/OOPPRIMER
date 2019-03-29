package rs.math.oop1.p070102.prevazilazenjePredefinisanog.z02.geometrija;

import static java.lang.Math.*;

public class Krug extends GeometrijskiObjekat {
   private Tacka o;
   private double r;

   public Krug(String oznaka, Tacka o, double r) {
      super(oznaka);
      this.o = new Tacka(o);
      this.r = r;
   }

   public Krug(Tacka o, double r) {
      this("", o, r);
   }

   public Krug(final Krug kr) {
      this(kr.getOznaka(), kr.o, kr.r);
   }

   public double obim() {
      return 2 * r * PI;
   }

   public double povrsina() {
      return pow(r, 2) * PI;
   }

   public boolean sadrzi(Tacka t) {
      return t.rastojanje(o) <= r;
   }

   @Override
   public String toString() {
      return super.toString() + ":[" + o + ";" + r + "]";
   }

   @Override
   public boolean jeKonveksan() {
      return true;
   }

   @Override
   public boolean jeOgranicen() {
      return true;
   }

}
