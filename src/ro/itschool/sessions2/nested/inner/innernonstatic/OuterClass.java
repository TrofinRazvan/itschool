package ro.itschool.sessions2.nested.inner.innernonstatic;

public class OuterClass {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        InnerNonStaticClass innerClass = outerClass.new InnerNonStaticClass("This is value of InnerClass.");

        innerClass.displayInnerField();

    }
    public class InnerNonStaticClass {
        private String innerStringField;

        public InnerNonStaticClass(String value) {
            this.innerStringField = value;
        }

        public void displayInnerField() {
            System.out.println("Inner field: " + innerStringField);
        }
    }
}