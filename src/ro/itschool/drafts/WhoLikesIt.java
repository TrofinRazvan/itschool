package ro.itschool.drafts;

public class WhoLikesIt {

    public static void main(String[] args) {
        String[] names = {"Ana", "Razvan", "Marin", "Eugen","Ana", "Razvan", "Marin", "Eugen"};
        System.out.println(whoLikesIt(names));
//        whoLikesIt(new String[]{"Ana", "Razvan", "Marin", "Eugen"});
    }

    public static String whoLikesIt(String[] names) {
//        if (names.length == 0) {
//            return "no one likes this";
//        } else if (names.length == 1) {
//            return names + " likes this.";
//        } else if (names.length == 2) {
//            return names[0] + " and " + names[1] + " like this";
//        } else {
//            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this.";
//        }

        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
    }
}