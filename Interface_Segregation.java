/**
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

/**
 * In this example:
 * We have three interfaces: Readable, Writable, and Printable,
 * each representing a specific document operation.
 * The TextDocument class implements Readable and Writable,
 * as it can be read from and written to.
 * The PDFDocument class implements Readable and Printable,
 * as it can be read from and printed.
 * The Main class demonstrates the usage of interfaces by
 * creating instances of TextDocument and PDFDocument and
 * invoking methods corresponding to each interface.
 * This example adheres to the Interface Segregation Principle
 * because each interface represents a specific capability,
 * and classes implement only the interfaces relevant to them.
 * Clients can interact with objects through interfaces without
 * depending on unnecessary methods or functionalities.
 */