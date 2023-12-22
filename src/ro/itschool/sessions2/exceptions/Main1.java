package ro.itschool.sessions2.exceptions;

public class Main1 {

    public static void main(String[] args) {
        ConnectionDB1 db1 = null;
        ConnectionDB1 db2 = null;

        try {
            if (1 == 1) throw new Exception();
            db1 = new ConnectionDB1();
            db2 = new ConnectionDB1();
            System.out.println("It is using...");
        } catch (Exception e) {
            System.out.println("Erros has been catch.");
        } finally {
            if (db1 != null) {
                db1.close();
            }

            if (db2 != null) {
                db2.close();
            }
        }
    }
    /**
     *  Cu ConnectionDB1, resursele sunt gestionate manual. Blocul try este deschis cu try
     *  {, iar resursele db1 și db2 sunt declarate înaintea blocului try. Resursele sunt inițializate în blocul try,
     *  iar apoi, în blocul finally, se verifică și se închid manual dacă acestea au fost inițializate.
     *  Aceasta este o modalitate veche de a gestiona resursele în Java și necesită cod suplimentar
     *  pentru gestionarea manuală a resurselor.
     */
}