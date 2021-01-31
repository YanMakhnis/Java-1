public class task2 {
    public static void main(String[] args) {
        int yearofBirthday = 1995;
        int monthofBirthday = 12;
        int dayofBirhtday = 19;
        int sum;
        sum = yearofBirthday + monthofBirthday + dayofBirhtday;
        System.out.println("Cумма моего года, месяца и дня рождения:" + sum);
        boolean monthBiggerDay = monthofBirthday > dayofBirhtday;
        if (monthofBirthday > dayofBirhtday) {
            System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);
        } else if (monthofBirthday < dayofBirhtday) {
            System.out.println("Месяц моего рождения меньше даты рождения: " + monthBiggerDay);
        }
        char[] name = new char[3];
        name[0] = 'Y';
        name[1] = 'a';
        name[2] = 'n';
        System.out.print("Массив с моим именем:");
        System.out.println(name);
        double myAge = 25;
        double partYear = 1.0 / 12.0;
        System.out.printf("Мне " + "%.2f", partYear + myAge);
        System.out.print(" лет");

    }
}

