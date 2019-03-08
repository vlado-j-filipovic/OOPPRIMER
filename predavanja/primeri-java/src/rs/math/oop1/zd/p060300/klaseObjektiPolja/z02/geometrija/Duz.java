package rs.math.oop1.zd.p060300.klaseObjektiPolja.z02.geometrija;

class Duz {
   String oznaka;
   Tacka a;
   Tacka b;

   void init(String o, Tacka t1, Tacka t2) {
      oznaka = o;
      a = t1;
      b = t2;
   }

   void prikaziSe() {
      System.out.print(oznaka + ":[");
      a.prikaziSe(true);
      System.out.print(";");
      b.prikaziSe(true);
      System.out.print("]");
   }

}
