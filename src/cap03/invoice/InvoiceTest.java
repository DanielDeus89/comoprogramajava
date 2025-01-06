package cap03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1","Teste",3,4);

        Invoice.notaFiscal(invoice);
    }
}
