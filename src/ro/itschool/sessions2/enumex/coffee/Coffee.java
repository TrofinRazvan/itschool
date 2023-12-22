package ro.itschool.sessions2.enumex.coffee;

public enum Coffee {
    CAFFE_LATTE(2.99), ESPRESSO(3.22), COFFEE_BLACK(1.11), MACCHIATO(4.11),
    DECAF;
    double price;

    Coffee(double price) {
        this.price = price;
    }

    Coffee() {

    }
}