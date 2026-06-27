void main() {
    int bonusEmploy = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите количество сотрудников");
    int N = sc.nextInt();
    sc.nextLine();


    Manager[] manager = new Manager[N];

    Employer bestEmploy = new Employer("AAA", 0);

    for (int i = 0; i < N; i++) {
        System.out.println("Введите имя сотрудника");
        String name = sc.nextLine();
        System.out.println("Введите количество выполненных задач");
        int tasksComplete = sc.nextInt();
        sc.nextLine();
        manager[i] = new Manager(name, tasksComplete);
        if (bestEmploy.getTasksComplete() < manager[i].getTasksComplete()){
            bestEmploy = manager[i];
        }
    }

    for (int n = 0; n < N; n++) {
        manager[n].canBonus(manager[n].getName(), manager[n].getTasksComplete());
        if (manager[n].getTasksComplete() >= 20){
            bonusEmploy++;
        }
    }
    System.out.println("Количество сотрудников, получивших премию: " + bonusEmploy +
    "n/ Лудший сотрудник: " + bestEmploy.getName());
}
