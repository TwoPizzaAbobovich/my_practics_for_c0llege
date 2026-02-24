package taxes;

public class USNDebitMinusCredit extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit){
       if ((int)((debit - credit) * 0.15)>0) {
           return (int) ((debit - credit) * 0.15);
       }else return 0;
    }
}
