public class Sportsman {
    private String name;
    private int result;

    Sportsman(String name, int result){
        this.name = name;
        this.result = result;
    }

    String getName(){
        return name;
    }

    int getResult(){
        return result;
    }

    void normative(String name, int result, int norm){
        if (result < norm){
            System.out.println(name + " не выполнил(а) норматив");
        } else System.out.println(name + " выполнил(а) норматив");
    }
}
