package ro.itschool.sessions2.oop.encapsulation.store;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Product> products = new ArrayList<>();

    public Store() {
        products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void displayAllProducts() {
        for (Product product : products) {
            product.displayProductsDetails();
            System.out.println("---------");
        }
    }
}