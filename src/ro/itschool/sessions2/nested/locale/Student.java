package ro.itschool.sessions2.nested.locale;

public class Student {
    private String name;
    private int age;
    private Address address;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAddress(String street, String city, String postalCode) {
        this.address = new Address(street, city, postalCode);
    }

    public Address getAddress() {
        return address;
    }
    public String toString() {
        return "" +
                "name: " + name + '\'' +
                ", age: " + age +
                ", address: " + address +
                "";
    }
    public static class Address {
        private String street;
        private String city;
        private String postalCode;

        public Address(String street, String city, String postalCode) {
            this.street = street;
            this.city = city;
            this.postalCode = postalCode;
        }

        @Override
        public String toString() {
            return "" +
                    "street: " + street + '\'' +
                    ", city: " + city + '\'' +
                    ", postalCode: " + postalCode + '\'' +
                    "";
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Lupu", 23);
        student.setAddress("Flori", "Bucharest", "00000");

        System.out.println("Student details: ");
        System.out.println(student);
        System.out.println("Address details:");
        System.out.println(student.getAddress());
    }
}