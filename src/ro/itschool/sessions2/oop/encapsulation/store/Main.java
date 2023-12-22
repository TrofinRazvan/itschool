package ro.itschool.sessions2.oop.encapsulation.store;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("PC",2300,42);
        Product product2 = new Product("phone",1230,12);

        Store store = new Store();
        store.addProduct(product1);
        store.addProduct(product2);
        store.removeProduct(product1);

        store.displayAllProducts();
    }
}