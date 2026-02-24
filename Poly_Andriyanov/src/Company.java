import taxes.TaxSystem;
import taxes.USNDebit;
import taxes.USNDebitMinusCredit;

public class Company {

    String title;
    int debit;
    int credit;
    private taxes.TaxSystem taxSystem;

    Company(String title, TaxSystem taxSystem){
        this.title = title;
        this.taxSystem = taxSystem;
        this.debit = 0;
        this.credit = 0;
    }
    //int debit, int credit,
    public void shiftMoney(int amount){
        /*this.debit = debit;
        this.credit = credit;*/
        if (amount>0){
            debit += amount;
            System.out.println("Ваши доходы составляют в сумме: " + debit);
        } else if (amount<0) {
            credit += Math.abs(amount);
            System.out.println("Ваши расходы составляют в сумме: " + credit);
        }else{
            System.out.println("Нет доходов или расходов");
        }
    }
    public void payTaxes(){
        int taxPrise = taxSystem.calcTaxFor(debit, credit);
        //int taxPrise = taxSystem.calcTaxFor(debit,credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + taxPrise + "руб.");
    }
    //int debit, int credit,
    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
        int dMC = (int) ((debit - credit) * 0.15);
        int d = (int) (debit * 0.15);
        if (dMC < d){taxSystem = new USNDebitMinusCredit();
            System.out.println("Выгодная система налогооблажения - УСН доходы");
        } else taxSystem = new USNDebitMinusCredit();
        System.out.println("Выгодная система налогооблажения - УСН доходы минус расходы");
    }
}
