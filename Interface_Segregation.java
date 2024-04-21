/** Name : Alakananda Chakrabartty
 * Student ID : 220206
 * Interface for documents that can be read.
 */
interface Readable {
    void read();
}

/**
 * Interface for documents that can be written.
 */
interface Writable {
    void write();
}

/**
 * Interface for documents that can be printed.
 */
interface Printable {
    void print();
}

/**
 * Class representing a simple text document.
 */
class TextDocument implements Readable, Writable {

    @Override
    public void read() {
        System.out.println("Reading text document...");
    }

    @Override
    public void write() {
        System.out.println("Writing text document...");
    }
}

/**
 * Class representing a PDF document.
 */
class PDFDocument implements Readable, Printable {

    @Override
    public void read() {
        System.out.println("Reading PDF document...");
    }

    @Override
    public void print() {
        System.out.println("Printing PDF document...");
    }
}

/**
 * A class demonstrating the usage of interfaces.
 */
public class Main {
    public static void main(String[] args) {
        TextDocument textDocument = new TextDocument();
        PDFDocument pdfDocument = new PDFDocument();

        // Read and write operations on text document
        textDocument.read();
        textDocument.write();

        // Read and print operations on PDF document
        pdfDocument.read();
        pdfDocument.print();
    }
}

