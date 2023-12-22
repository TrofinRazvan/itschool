package ro.itschool.sessions2.nested.inner;

public class A {
    int x;
    private int z;
    static int y;

    public class B{
        int x;
        public void m1() {
            z++;
            this.x++;
            A.this.x++;
            y++;
        }
    }

    static public class C{
        public void m2() {
            y++;
        }
    }
}