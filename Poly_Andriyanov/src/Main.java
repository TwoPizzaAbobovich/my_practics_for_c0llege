import taxes.TaxSystem;
import taxes.USNDebit;
import taxes.USNDebitMinusCredit;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
String title = "a";
TaxSystem cTaxSystem = new USNDebit();
Scanner sc = new Scanner(System.in);

Company company = new Company(title,cTaxSystem);

while (true){
    System.out.println("");
System.out.println("Введите доход(положительное знаяенипе) или расход(отрицательное значение)");
int amount = sc.nextInt();
company.shiftMoney(amount);
company.setTaxSystem(cTaxSystem);
    System.out.println("Если вы закончили добавлять доход/расход, введите да");
    sc.nextLine();
String chose = sc.nextLine();
if (chose.equals("да")) {
    break;
} else System.out.print("");}
company.payTaxes();
        }}
// = company.shiftMoney(100);
