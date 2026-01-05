// WAP to final keywords with Variables

class Road {
    // A final variable for a constant speed limit
    final int SPEED_LIMIT = 60; // Value assigned once

    public void checkSpeed() {
        System.out.println("Current speed limit: " + SPEED_LIMIT + " km/h");
        // SPEED_LIMIT = 70; // ❌ ERROR! You cannot reassign a final variable.
    }

}

public class FinalKeywordsExpV1 {
    public static void main(String[] args) {
        Road obj = new Road();
        obj.checkSpeed();
    }
}