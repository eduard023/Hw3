public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    private static void task1() {



            // Задача 1
            System.out.println("Задача 1!");
            byte a = 4;
            short b = 11;
            int c = 249;
            long d = 789L;
            float x = 4.56f;
            double z = 15.897;
            System.out.println("Значение переменной a c типом byte равно " + a);
            System.out.println("Значение переменной b c типом short равно " + b);
            System.out.println("Значение переменной c c типом int равно " + c);
            System.out.println("Значение переменной d c типом long равно " + d);
            System.out.println("Значение переменной x c типом float равно " + x);
            System.out.println("Значение переменной z c типом double равно " + z);
        }

    private static void task2() {

        // Задание 2
       System.out.println("Задание 2!");
        float weight = 27.12f;
        long tree = 987678965549L;
        double sugar = 2.786;
        boolean light = false;
        char mouse = 569;
        short k = -159;
        int onion = 27897;
        byte tip = 67;
        }

        private static void task3() {
        // Задание 3
            System.out.println("Задание 3!");
            int ludmilaPavlov = 23;
            int annSergeev = 27;
            int ekaAndreev = 30;
            int totalPaper = 480;
            int totalStudents = ludmilaPavlov + annSergeev + ekaAndreev;
            int paperStudents = totalPaper / totalStudents;
            System.out.println("На каждого ученика рассчитано " + paperStudents + " листов бумаги.");


        }

        private static void task4()  {
        // Задание 4
            System.out.println("Задание 4!");
            int time = 2;
            int productivity = 16;
            int productivityPerMinute = productivity / time;
            int productivityMinute20 = productivityPerMinute * 20;
            int minuteDay = 24 * 60;
            int productivityDay = minuteDay * productivityPerMinute;
            int productivityDay3 = productivityDay * 3;
            int productivityMonth = productivityDay * 30;
            System.out.println("За 20 минут машина произвела " + productivityMinute20 + " штук.");
            System.out.println("За сутки машина произвела " + productivityDay + " штук.");
            System.out.println("За 3 дня машина произвела " + productivityDay3 + " штук.");
            System.out.println("За 1 месяц машина произвела " + productivityMonth + " штук.");

        }
        private static void task5()  {
        // Задание 5
            System.out.println("Задание 5!");
            int totalGars = 120;
            int garsOnClassWhite = 2;
            int garsOnClassBrown = 4;
            int totalGarsClasses = garsOnClassBrown + garsOnClassWhite;
            int totalClasses = totalGars / totalGarsClasses;
            int totalWhite = totalClasses * garsOnClassWhite;
            int totalBrown = totalClasses * garsOnClassBrown;
            System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и "+ totalBrown + " банок коричневой краски.");

        }

        private static void task6(){
        // Задание 6
            System.out.println("Задание 6!");
            int bananas = 5 * 80;
            int milks = 105 * 2;
            int iceCream = 2 * 100;
            int eggs = 4 * 70;
            int totalWeight = bananas + milks + iceCream + eggs;
            double totalWeightKg = (double)totalWeight / 1000;
            System.out.println("Вес спорт-завтрака " + totalWeightKg + " кг.");
        }

        private static void task7(){
        // Задание 7
            System.out.println("Задание 7!");
            int totalLoseWeight = 7 * 1000;
            int easeLoseWeightDays = totalLoseWeight / 250;
            int hardLoseWeightDays = totalLoseWeight / 500;
            int onAverageDays = (easeLoseWeightDays + hardLoseWeightDays) / 2;
            System.out.println(easeLoseWeightDays + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм.");
            System.out.println(hardLoseWeightDays + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм.");
            System.out.println(onAverageDays + " день может потребоваться в среднем чтобы добиться результата похудения.");

        }

        private static void task8(){
        //Задание 8
            System.out.println("Задание 8!");
            int mashaWagesYear = 67_760 * 12;
            int denisWagesYear = 83_690 * 12;
            int kristinaWagesYear = 76_230 * 12;
            int mashaWagesYearBoost = mashaWagesYear * (1 + 10) / 10;
            int denisWagesYearBoost = denisWagesYear * (1 + 10) / 10;
            int kristinaWagesYearBoost = kristinaWagesYear * (1 + 10) / 10;
            int mashaWagesMonthBoost = mashaWagesYearBoost / 12;
            int denisWagesMonthBoost = denisWagesYearBoost / 12;
            int kristinaWagesMonthBoost = kristinaWagesYearBoost / 12;
            System.out.println("Маша теперь получает " + mashaWagesMonthBoost + " рублей. Годовой доход вырос на " + (mashaWagesYearBoost - mashaWagesYear) + " рублей." );
            System.out.println("Денис теперь получает " + denisWagesMonthBoost + " рублей. Годовой доход вырос на " + (denisWagesYearBoost - denisWagesYear) + " рублей." );
            System.out.println("Кристина теперь получает " + kristinaWagesMonthBoost + " рублей. Годовой доход вырос на " +(kristinaWagesYearBoost - kristinaWagesYear) + " рублей." );
        }


    }