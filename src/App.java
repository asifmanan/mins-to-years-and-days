public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getYearsAndDays(561600));
    }

    public static String getYearsAndDays(long minutes){
        if (minutes<0) return "Invalid Data";
        long years = minutes/525600;
        long remainingMinutes = minutes % 525600;
        long days = remainingMinutes / 1440;
        return minutes + " min = " + years + " y and " + days + " d";
    }
}
