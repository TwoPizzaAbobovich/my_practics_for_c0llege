package taxes;

public class USNDebit extends TaxSystem {
    @Override
    /* public int taxUSNDebitMinusCredit(int debit) {
        return (int) (debit * 0.15);}*/
    public int calcTaxFor(int debit, int credit) {
        return (int) (debit * 0.15);}
}
