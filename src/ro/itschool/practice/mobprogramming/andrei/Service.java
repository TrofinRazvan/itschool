package ro.itschool.practice.mobprogramming.andrei;

import java.util.ArrayList;
import java.util.List;

public class Service {

    List<BookAddress> contactList = new ArrayList<>();

    public void addContact(BookAddress bookAddress) {
        contactList.add(bookAddress);
    }

    public void removeContact(BookAddress bookAddress) {
        contactList.remove(bookAddress);
    }

    public void viewAll() {
        System.out.println("print viewAll" + contactList);
    }

    public List<BookAddress> searchBookAddressByName(String name) {
        List<BookAddress> result = new ArrayList<>();
        for (BookAddress bookAddress : contactList) {
            if (bookAddress.getFirstName().equalsIgnoreCase(name) ||
                    bookAddress.getLastName().equalsIgnoreCase(name)) {
                result.add(bookAddress);
            }
        }
        System.out.println("Result found:" + result);
        return result;
    }
}