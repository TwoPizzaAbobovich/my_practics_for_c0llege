void main() {
    int passExam = 0;
    Student bestStudy = new Student("", 0);
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите количество студентов");
    int N = sc.nextInt();
    sc.nextLine();
    ExelentStudent[] students = new ExelentStudent[N];
    for (int i = 0; i < N; i++) {
        System.out.println("Введите имя студента");
        String name = sc.nextLine();
        System.out.println("Введите баллы");
        int score = sc.nextInt();
        sc.nextLine();
        students[i] = new ExelentStudent(name, score);
    }

    for (int i = 0; i < N; i++) {
        students[i].isExelent();
        if (students[i].getScore() >= 60){
            passExam++;
        }
        if (students[i].getScore() > bestStudy.getScore()){
            bestStudy = students[i];
        }
    }
    System.out.println("Количество сдавших екзамен: " + passExam +
            "/n Лудший результат показал: " + bestStudy.getName());
}
