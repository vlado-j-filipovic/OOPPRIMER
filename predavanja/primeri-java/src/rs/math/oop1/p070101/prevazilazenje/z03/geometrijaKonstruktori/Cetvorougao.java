package rs.math.oop1.p070101.prevazilazenje.z03.geometrijaKonstruktori;

public class Cetvorougao extends GeometrijskiObjekat {
   private Tacka a;
   private Tacka b;
   private Tacka c;
   private Tacka d;

   public Cetvorougao(String oznaka, Tacka a, Tacka b,
            Tacka c, Tacka d) {
      super(oznaka);
      this.a = new Tacka(a);
      this.b = new Tacka(b);
      this.c = new Tacka(c);
      this.d = new Tacka(d);
   }

   public Cetvorougao(Tacka a, Tacka b, Tacka c, Tacka d) {
      this("", a, b, c, d);
   }

   public Cetvorougao(final Cetvorougao cetv) {
      this(cetv.getOznaka(), cetv.a, cetv.b, cetv.c,
               cetv.d);
   }

   public void prikaziSe() {
      super.prikaziSe();
      System.out.print(":[");
      a.prikaziSe();
      System.out.print(";");
      b.prikaziSe();
      System.out.print(";");
      c.prikaziSe();
      System.out.print(";");
      d.prikaziSe();
      System.out.print("]");
   }

   public double obim() {
      return a.rastojanje(b) + b.rastojanje(c)
               + c.rastojanje(d) + d.rastojanje(a);
   }

   public double povrsina() {
      Prava p = new Prava(a, c);
      if (p.suSaRaznihStranaPrave(b, d)) {
         Trougao t1 = new Trougao(a, c, b);
         Trougao t2 = new Trougao(a, c, d);
         return t1.povrsina() + t2.povrsina();
      } else {
         Trougao t1 = new Trougao(b, d, a);
         Trougao t2 = new Trougao(b, d, c);
         return t1.povrsina() + t2.povrsina();
      }
   }

   public boolean sadrzi(Tacka t) {
      double suma = 0;
      Trougao tr = new Trougao(a, b, t);
      suma += tr.povrsina();
      tr = new Trougao(b, c, t);
      suma += tr.povrsina();
      tr = new Trougao(c, d, t);
      suma += tr.povrsina();
      tr = new Trougao(d, a, t);
      suma += tr.povrsina();
      return (suma == povrsina());
   }

   public boolean jeKonveksan() {
      Prava p = new Prava(a, b);
      if (p.suSaRaznihStranaPrave(c, d))
         return false;
      p = new Prava(b, c);
      if (p.suSaRaznihStranaPrave(a, d))
         return false;
      p = new Prava(c, d);
      if (p.suSaRaznihStranaPrave(a, b))
         return false;
      p = new Prava(d, a);
      if (p.suSaRaznihStranaPrave(b, c))
         return false;
      return true;
   }

   public boolean jeOgranicen() {
      return true;
   }

}
