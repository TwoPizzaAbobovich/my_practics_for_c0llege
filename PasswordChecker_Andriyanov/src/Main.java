void main(String[] args) {
    PasswordChecker passwordUser = new PasswordChecker();
    Scanner sc = new Scanner(System.in);
    try {
        System.out.print("Введите мин. длину пароля: ");
        int myMinLgth = Integer.parseInt(sc.nextLine());
        passwordUser.setMinLength(myMinLgth);
        System.out.print("Введите макс. допустимое количество повторений символа подряд: ");
        int maxRepetitions = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        passwordUser.setMaxRepeats(maxRepetitions);
        System.out.print("Введите пароль или end: ");
        String newPassword  = sc.nextLine();
    } catch (NumberFormatException e) {
        System.out.println("Ошибка: введено не число. Программа завершена.");
    } catch (IllegalArgumentException e) {
        System.out.println("Ошибка настройки: " + e.getMessage());
        System.out.println("Программа завершена");
    }
    while (true) {
        System.out.print("Введите пароль или end: ");
        String userInput = sc.nextLine();

        if (userInput.equals("end")) {
            break;
        }

        try {
            boolean isValid = passwordUser.verify(userInput);
            if (isValid) {
                System.out.println("Подходит!");
            } else {
                System.out.println("Не подходит!");
            }
        } catch (IllegalStateException e) {
            System.out.println("Ошибка состояния чекера: " + e.getMessage());
            break;
        }
    }

    System.out.println("Программа завершена");
}
