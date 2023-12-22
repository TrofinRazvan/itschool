package ro.itschool.sessions2.exceptions;

public class Main2 {

    public static void main(String[] args) {
        try (
                ConnectionDB2 db1 = new ConnectionDB2();
                ConnectionDB2 db2 = new ConnectionDB2();
        ) {
            if (1 == 1) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("The exception was caught.");

            Throwable[]  vector = e.getSuppressed();

            for (Throwable t : vector) {
                System.out.println(t.getMessage());
            }
        } finally {
            System.out.println("Finnaly explicit.");
        }
    }
    /** Cu ConnectionDB2, se utilizează try-with-resources. Blocul try are o altă formă:
     *  try (...) {, iar resursele (ConnectionDB2 db1 și ConnectionDB2 db2) sunt declarate
     *  în interiorul parantezelor rotunde (...). Acesta este modul modern de a gestiona resursele,
     *  unde Java se ocupă automat de închiderea resurselor la sfârșitul blocului try,
     *  fără a necesita un bloc finally suplimentar. Acesta este cunoscut ca try-with-resources
     *  și a fost introdus în Java pentru a simplifica gestionarea resurselor și pentru a preveni
     *  scurgerile de resurse.
     */
}