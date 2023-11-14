public class Task_8 {
    public static void main(String[] args) {
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristy = 76230;
        int newSalaryMasha = salaryMasha + salaryMasha/10;
        int newSalaryDenis = salaryDenis + salaryDenis/10;
        int newSalaryKristy = salaryKristy + salaryKristy/10;
        System.out.printf("Маша теперь получает %d рублей. Годовой доход вырос на %d рублей\n",
                newSalaryMasha,newSalaryMasha-salaryMasha);
        System.out.printf("Денис теперь получает %d рублей. Годовой доход вырос на %d рублей\n",
                newSalaryDenis,newSalaryDenis-salaryDenis);
        System.out.printf("Кристина теперь получает %d рублей. Годовой доход вырос на %d рублей\n",
                newSalaryKristy,newSalaryKristy-salaryKristy);
    }
}
