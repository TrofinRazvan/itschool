package ro.itschool.sessions2.nested.inner;

public class OuterClass {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        InnerClass innerClass = outerClass.new InnerClass("Private field.");

        System.out.println(innerClass.privateField);

        innerClass.setPrivateField("Second field.");

        System.out.println(innerClass.privateField);
    }
    public class InnerClass {
        private String privateField;

        private InnerClass(String privateField) {
            this.privateField = privateField;
        }

        public String getPrivateField() {
            return privateField;
        }

        public void setPrivateField(String privateField) {
            this.privateField = privateField;
        }
    }
}