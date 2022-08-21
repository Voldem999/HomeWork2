public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work 2!");

        // Задача 1
        byte cat = 1;
        short apple = 4;
        int orange = 10;
        long daysInYear = 365L;
        float sugarWeight = 3.5f;
        double gasolineOfLiters = 21.6;

        // Задача 2
        double boxerOneWeight = 78.2;
        double boxerTwoWeight = 82.7;
        double totalWeightOfBoxers = boxerOneWeight + boxerTwoWeight;
        System.out.println("Общий вес боксеров " + totalWeightOfBoxers + " кг");
        double boxersWeightDifference = boxerTwoWeight - boxerOneWeight;
        System.out.println("Разница в весе боксеров " + boxersWeightDifference + " кг");

        // Задача 3
        short bananas = 5;
        short oneBanana = 80;
        int bananasWeight = bananas * oneBanana;
        System.out.println("Вес бананов " + bananasWeight + " грамм" );
        short milkAll = 200;
        short milkWeight = 105;
        int milkAllWeight = milkWeight % milkAll * 2;
        System.out.println("Вес молока " + milkAllWeight + " грамм");
        short iceCream = 2;
        short iceCreamWeight = 100;
        int iceCreamAllWeight = iceCream * iceCreamWeight;
        System.out.println("Вес всего мороженного " + iceCreamAllWeight + " грамм");
        short eggs = 4;
        short eggOneWeight = 70;
        int eggsAllWeight = eggs * eggOneWeight;
        System.out.println("Вес всех яиц " + eggsAllWeight + " грамм");
        int sportsBreakfast= bananasWeight + milkAllWeight + iceCreamAllWeight + eggsAllWeight;
        System.out.println("Общий вес спротивного завтрака " + sportsBreakfast + " грамм");

        float sportsBreakFast = 1090;
        float oneKg = 1000;
        float weightBreakfast = sportsBreakfast / oneKg;
        System.out.println("Вес завтрака " + weightBreakfast + " кг");

        // Задача 4
        int weightLoseKg = 7;
        int gramsInKg = 1000;
        int weightLoseGrams = weightLoseKg * gramsInKg;
        int weightLoseinDay1 = 250;
        int allDay1 = weightLoseGrams / weightLoseinDay1;
        System.out.println("Пройдет " + allDay1 + " дней");
        int weightLoseInDay2 = 500;
        int allDay2 = weightLoseGrams / weightLoseInDay2;
        System.out.println("Пройдет " + allDay2 + " дней");
        int weightLoseAverageInDay = (allDay1 + allDay2) / 2;
        System.out.println("Потребуется в среднем " + weightLoseAverageInDay + " дней");

        // Задача 5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;
        int oneYear = 12;
        int salaryIncreaseMasha = salaryMasha + (salaryMasha * 10 / 100);
        int salaryIncreaseDenis = salaryDenis + (salaryDenis * 10 / 100);
        int salaryIncreaseKris = salaryKris + (salaryKris * 10 / 100);
        System.out.println("Маша теперь получает " + salaryIncreaseMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryIncreaseDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryIncreaseKris + " рублей");
        int salaryThisYearMasha = salaryMasha * oneYear;
        int salaryThisYearDenis = salaryDenis * oneYear;
        int salaryThisYearKris = salaryKris * oneYear;
        System.out.println("Маша получает за год " + salaryThisYearMasha + " рублей");
        System.out.println("Декнис полчает за год " + salaryThisYearDenis + " рублей");
        System.out.println("Кристина получает за год " + salaryThisYearKris + " рублей");
        int salaryNextYearMasha = salaryIncreaseMasha * oneYear;
        int salaryNextYearDenis = salaryIncreaseDenis * oneYear;
        int salaryNextYearKris = salaryIncreaseKris * oneYear;
        System.out.println("Зарплата Маши после повышения за год " + salaryNextYearMasha + " рублей");
        System.out.println("Зарплата Дениса после повышения за год " + salaryNextYearDenis + " рублей");
        System.out.println("Зарплата Кристины после повышения за год " + salaryNextYearKris + " рублей");
        int salaryIncreaseMasha2 = salaryNextYearMasha % salaryThisYearMasha;
        int salaryIncreaseDenis2 = salaryNextYearDenis % salaryThisYearDenis;
        int salaryIncreaseKris2 = salaryNextYearKris % salaryThisYearKris;
        System.out.println("Годовой доход Маши увеличился на " + salaryIncreaseMasha2 + " рублей");
        System.out.println("Годовой доход Дениса увеличился на " + salaryIncreaseDenis2 + " рублей");
        System.out.println("Годовой доход Кристины увеличился на " + salaryIncreaseKris2 + " рублей");






    }
}