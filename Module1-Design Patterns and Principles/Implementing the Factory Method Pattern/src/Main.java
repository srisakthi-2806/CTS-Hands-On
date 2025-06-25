public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocFactory();
        Document word = wordFactory.createDocument();
        word.open();

        DocumentFactory pdfFactory = new PdfDocFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        DocumentFactory excelFactory = new ExcelDocFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}
