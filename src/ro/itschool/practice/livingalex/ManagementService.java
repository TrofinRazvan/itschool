package ro.itschool.practice.livingalex;

public class ManagementService {
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        System.out.println(livingRoom.getColour());

        livingRoom.setColour("green");
        livingRoom.setLenghtRoom(12.5);
        livingRoom.setWidthRoom(15.1);

        livingRoom.setWindows(true);
        livingRoom.setWindowsHeight(1.5);
        livingRoom.setWindowsWidth(3.5);
        livingRoom.setWindowsPosition("On the west side of the building");

        livingRoom.setAc(true);
        livingRoom.setTv(true);
        livingRoom.setCouch(true);
        livingRoom.setWifi(false);

        boolean isAcRoom = livingRoom.isAc();
        boolean isTvRoom = livingRoom.isTv();
        boolean isCouchRoom = livingRoom.isCouch();
        boolean isWifiRoom = livingRoom.isWifi();

        double feeForRoomSize = getFeeForRoomSize(livingRoom.getLenghtRoom(), livingRoom.getWidthRoom());
        double feeForUtilities = getFeeForUtilities(isAcRoom, isTvRoom, isCouchRoom, isWifiRoom);
        double totalLivingRoom = feeForRoomSize + feeForUtilities;
        System.out.println("Total fee for living room: " + totalLivingRoom);
    }

    public static double getFeeForRoomSize(double lenght, double width) {
        double priceForSquareMeter = 10;
        double roomSize = lenght * width;

        return roomSize * priceForSquareMeter;
    }

    public static double getFeeForUtilities(boolean ac, boolean tv, boolean couch, boolean wifi) {
        double fee = 0;
        double feePerUnit = 5;
        if (ac) {
            fee += feePerUnit;
        }
        if (tv) {
            fee += feePerUnit;
        }
        if (couch) {
            fee += feePerUnit;
        }
        if (wifi) {
            fee += feePerUnit;
        }
        return fee;

    }
}