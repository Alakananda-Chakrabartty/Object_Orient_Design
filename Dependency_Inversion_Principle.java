/**
 * Interface defining a report generator.
 */
interface ReportGenerator {
    void generateReport();
}

/**
 * Class implementing a PDF report generator.
 */
class PDFReportGenerator implements ReportGenerator {

    @Override
    public void generateReport() {
        System.out.println("Generating PDF report...");
    }
}

/**
 * Class implementing an Excel report generator.
 */
class ExcelReportGenerator implements ReportGenerator {

    @Override
    public void generateReport() {
        System.out.println("Generating Excel report...");
    }
}

/**
 * Class representing a report client.
 */
class ReportClient {
    private ReportGenerator reportGenerator;

    public ReportClient(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generateReport() {
        reportGenerator.generateReport();
    }
}

/**
 * Main class demonstrating the usage of report client.
 */
public class Main {
    public static void main(String[] args) {
        // Create instances of report generators
        ReportGenerator pdfReportGenerator = new PDFReportGenerator();
        ReportGenerator excelReportGenerator = new ExcelReportGenerator();

        // Create report clients with different report generators
        ReportClient pdfReportClient = new ReportClient(pdfReportGenerator);
        ReportClient excelReportClient = new ReportClient(excelReportGenerator);

        // Generate reports using respective clients
        pdfReportClient.generateReport();
        excelReportClient.generateReport();
    }
}
/**
 * 
Let's create another example to demonstrate the Dependency Inversion Principle (DIP). This time, let's consider a scenario where we have a reporting system that generates reports in different formats. We'll define an interface for the report generation and have different classes implementing this interface for generating reports in various formats.

java
Copy code
/**
 * Interface defining a report generator.
 */
interface ReportGenerator {
    void generateReport();
}

/**
 * Class implementing a PDF report generator.
 */
class PDFReportGenerator implements ReportGenerator {

    @Override
    public void generateReport() {
        System.out.println("Generating PDF report...");
    }
}

/**
 * Class implementing an Excel report generator.
 */
class ExcelReportGenerator implements ReportGenerator {

    @Override
    public void generateReport() {
        System.out.println("Generating Excel report...");
    }
}

/**
 * Class representing a report client.
 */
class ReportClient {
    private ReportGenerator reportGenerator;

    public ReportClient(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generateReport() {
        reportGenerator.generateReport();
    }
}

/**
 * Main class demonstrating the usage of report client.
 */
public class Main {
    public static void main(String[] args) {
        // Create instances of report generators
        ReportGenerator pdfReportGenerator = new PDFReportGenerator();
        ReportGenerator excelReportGenerator = new ExcelReportGenerator();

        // Create report clients with different report generators
        ReportClient pdfReportClient = new ReportClient(pdfReportGenerator);
        ReportClient excelReportClient = new ReportClient(excelReportGenerator);

        // Generate reports using respective clients
        pdfReportClient.generateReport();
        excelReportClient.generateReport();
    }
}
/**
 * In this example:
 * We have a ReportGenerator interface that defines a method generateReport().
 * There are two classes implementing the ReportGenerator interface:
 * PDFReportGenerator and ExcelReportGenerator.
 * The ReportClient class represents a client that generates reports
 * using a ReportGenerator.
 * In the Main class, we create instances of PDFReportGenerator and
 * ExcelReportGenerator, and then create ReportClient instances
 * with these generators.
 * This example adheres to the Dependency Inversion Principle because:
 * High-level modules (like ReportClient) depend on abstractions (ReportGenerator)
 * rather than concrete implementations (PDFReportGenerator and ExcelReportGenerator).
 * Low-level modules (PDFReportGenerator and ExcelReportGenerator) also depend
 * on the same abstraction (ReportGenerator), making them interchangeable
 * without affecting the high-level modules.
 */