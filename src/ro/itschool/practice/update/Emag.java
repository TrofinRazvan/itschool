package ro.itschool.practice.update;

import ro.itschool.practice.store.Client;
import ro.itschool.practice.store.StoreService;

public class Emag {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        storeService.setStock();
        storeService.setPrice();
        int appleStock = storeService.getAppleInitialStock();

        System.out.println(appleStock);

        ro.itschool.practice.store.Client client = new Client();
        client.setBudgetClient(350);

        storeService.getApplePurchasePrice(15);
    }
}
