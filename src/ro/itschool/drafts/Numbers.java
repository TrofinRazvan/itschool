package ro.itschool.drafts;


public class Numbers {

    public static void main(String[] args) {
        Object[] result = {"h", "o", "l", "a"};
        System.out.println(printArray(result));
    }

    public static String printArray(Object[] array) {
        StringBuilder sb = new StringBuilder();
        int lastindex = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < lastindex) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}