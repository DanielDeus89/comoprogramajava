package cap03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1","Tela monitor",3,787.88);

        Invoice.notaFiscal(invoice);
    }
}
