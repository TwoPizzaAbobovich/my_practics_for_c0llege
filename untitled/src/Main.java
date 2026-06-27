void main() {
Scanner sc = new Scanner(System.in);
    int norm = 50;
    System.out.println("Введите количество студентов");
    int N = (sc.nextInt());
    sc.nextLine();
    String name[] = new String[N];
    int result[] = new int[N];

    Runner runner[] = new Runner[N];
    for (int i = 0; i < N; i++) {
        System.out.println("Введите имя студента/студентки");
         name[i] = sc.nextLine();
        sc.nextLine();
        System.out.println("Введите результат");
        result[i] = sc.nextInt();
        sc.nextLine();
        runner[i] = new Runner(name[i], result[i]);
    }

    for (int m = 0; m < N; m++) {
        runner[m].normative(runner[m].getName(), runner[m].getResult(), norm);
    }
}
