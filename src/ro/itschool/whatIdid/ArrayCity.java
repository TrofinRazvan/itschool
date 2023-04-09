package ro.itschool.whatIdid;

public class ArrayCity {

    public static void main(String[] args) {

        String[] array = {"Iasi","Targu","Ilfov"};
        System.out.println(array[2]);
        for (int index = 0; index < array.length; index++) {
            if (array[index].equalsIgnoreCase("iasi")) {
                System.out.println("It is on index: " + index);
                break; // in cazul in care am gasit index-ul si nu ma mai intereseaza ce valori mai sunt(daca sunt n cazuri)
            }
        }

    }


}
