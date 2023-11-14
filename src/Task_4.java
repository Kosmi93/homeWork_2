public class Task_4 {
    public static void main(String[] args) {
        int bottlePerformanceOneMin = 16/2;
        int bottlePerformanceOneDay = 24*60*bottlePerformanceOneMin;
        int bottlePerformanceOneMonth = bottlePerformanceOneDay *30;
        System.out.println("За 20 минут машина произвела " + bottlePerformanceOneMin * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlePerformanceOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlePerformanceOneDay * 3 + " штук бутылок");
        System.out.println("За месяц минут машина произвела " +bottlePerformanceOneMonth + " штук бутылок");
    }
}
