package ro.itschool.practice.mobprogramming.andrei;

public class Main {

    public static void main(String[] args) {


        BookAddress bookAddress1 = new BookAddress();

        bookAddress1.setFirstName("Adrian");
        bookAddress1.setLastName("Nechifor");
        bookAddress1.setPhoneNumber("46546+54656");
        bookAddress1.setEmailAddress("adrain@gmail.com");
        bookAddress1.setAge(26);

        BookAddress bookAddress2 = new BookAddress();

        bookAddress2.setFirstName("Marin");
        bookAddress2.setLastName("Preda");
        bookAddress2.setPhoneNumber("4654324656");
        bookAddress2.setEmailAddress("marin@gmail.com");
        bookAddress2.setAge(46);

        Service service = new Service();
        service.addContact(bookAddress1);
        service.addContact(bookAddress2);
        service.removeContact(bookAddress2);
        service.viewAll();
        service.searchBookAddressByName("Florin");
    }
}