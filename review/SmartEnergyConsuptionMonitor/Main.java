package review.SmartEnergyConsuptionMonitor;


public class Main {
    public static void main(String[] args) {
//        SmartEnergyMonitor monitor = new SmartEnergyMonitor();
        System.out.println("Welcome to Smart Energy Consuption Monitor");
        
        Menu m = new Menu();
        try {
        	m.start();
        }
        catch(InvalidEnergyReadingException e) {
        	System.out.println("Exception handled in main");
        	System.out.println(e.getMessage());
        }
        
//        try {
//            monitor.addReading("27/01/2026", 5.2);
//            monitor.addReading("27/01/2026", 4.8);
//            monitor.addReading("27/01/2026", 6.0);
////            monitor.addReading("27/01/2026", -3);
//            monitor.addReading("28/01/2026", 10.2);
//            monitor.addReading("28/01/2026", 11.8);
//            monitor.addReading("28/01/2026", 12.50);
//
//            System.out.println("Daily Average: " + monitor.getDailyAverage("27/01/2026"));
//            System.out.println("Monthly Average: " + monitor.getMonthlyAverage());
//
//        } catch (InvalidEnergyReadingException e) {
//            System.out.println("Exception is handled in main class ");
//            System.out.println(e.getMessage());
//        }
    }
}
