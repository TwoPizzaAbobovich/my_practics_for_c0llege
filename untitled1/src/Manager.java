public class Manager extends Employer{
    int N;
    Manager(String name, int tasksComplete) {
        super(name, tasksComplete);
    }

    void canBonus(String n, int tC){

        if (tC >= 20){
            System.out.println(n + " получил(а) премию");
        } else System.out.println(n + " не получил(а) премию");
    }
}
