package ro.itschool.sessions2.object;

public class Punct {
    int x;
    int y;

    Punct() {

    }

    Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object o) {
        if (o == null)
            return false;

        if (!(o instanceof Punct))
            return false;

        Punct p1 = (Punct) o;
        if ((this.x == p1.x) && (this.y == p1.y)) {
            return true;
        } else {
            return false;
        }
    }
}