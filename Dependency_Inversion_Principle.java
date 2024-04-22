/**Name : Alakananda Chakrabartty
 * Student ID : 220206
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
