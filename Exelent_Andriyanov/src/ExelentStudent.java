public class ExelentStudent extends Student{
    ExelentStudent(String name, int score) {
        super(name, score);
    }

    void isExelent(){
        if (super.getScore() >= 60){
            System.out.println(super.getName() + " сдал(а) экзамен");
        } else System.out.println(super.getName() + " не сдал(а) экзамен");
    }
}
