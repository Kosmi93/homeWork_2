public class Task_5 {
    public static void main(String[] args) {
        int allBottlePaint = 120;
        int bottleWhitePaintOneClassRoom = 2;
        int bottleBrownPaintOneClassRoom = 4;
        int allClassRoom = allBottlePaint/(bottleWhitePaintOneClassRoom + bottleBrownPaintOneClassRoom);
        int allBottleBrownPaint = allClassRoom * bottleBrownPaintOneClassRoom;
        int allBottleWhitePaint = allClassRoom * bottleWhitePaintOneClassRoom;

        System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски",
                allClassRoom,allBottleWhitePaint,allBottleBrownPaint);
    }
}
