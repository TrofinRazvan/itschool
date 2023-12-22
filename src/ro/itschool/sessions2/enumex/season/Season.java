package ro.itschool.sessions2.enumex.season;

public enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;

    public void printDescription() {
        switch (this) {
            case SPRING:
                System.out.println("Spring is a season of rebirth.");
                break;
            case SUMMER:
                System.out.println("Summer is a season of warmth.");
                break;
            case AUTUMN:
                System.out.println("Autumn is a season of falling leaves.");
                break;
            case WINTER:
                System.out.println("Winter is a season of cold and snow.");
                break;
        }
    }
}