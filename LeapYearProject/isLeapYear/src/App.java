public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int month = 2;
        int x = 1997;
        boolean result  = LeapYear.isLeapYear(x);
        int days        = LeapYear.getDaysInMonth(month, x); 
        System.out.println(result);
        System.out.println(days);
    }
}
