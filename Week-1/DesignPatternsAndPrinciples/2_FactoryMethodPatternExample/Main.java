public class Main {
    public static void main(String[] args) {
        DocumentFactory factory;

        factory = new WordDocumentFactory();
        Document wordDoc = factory.createDocument();
        wordDoc.open();

        factory = new PdfDocumentFactory();
        Document pdfDoc = factory.createDocument();
        pdfDoc.open();

        factory = new ExcelDocumentFactory();
        Document excelDoc = factory.createDocument();
        excelDoc.open();
    }
}