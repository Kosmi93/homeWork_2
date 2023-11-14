public class Task_3 {
    public static void main(String[] args) {
        int classLudmilly = 23;
        int classAnny = 27;
        int classKateriny = 30;
        int totalSheets = 480;
        int sheetsOneStudent = totalSheets /(classAnny+classKateriny+classLudmilly);
        System.out.println("На каждого ученика рассчитано "+ sheetsOneStudent +" листов бумаги");
    }
}
