package java_8_features.functionalInterface.defaultMethodsinInterfaces;

interface DataExporter {
    void export(String format);
    default void exportToJSON() {
        System.out.println("Exporting data to JSON format (Default Implementation)");
    }
}

public class DataExportFunctionalDemo {
    public static void main(String[] args) {

        DataExporter exporter = new DataExporter() {
            public void export(String format) {
                if(format.equalsIgnoreCase("CSV")) {
                    System.out.println("Exporting data to CSV format");
                }
                else if(format.equalsIgnoreCase("PDF")) {
                    System.out.println("Exporting data to PDF format");
                }
                else {
                    System.out.println("Unsupported Format");
                }
            }
        };
        exporter.export("CSV");
        exporter.export("PDF");
        exporter.exportToJSON();   
    }
}