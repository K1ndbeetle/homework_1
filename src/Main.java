public class Main {
    public static void main(String[] args) {
        //homework1
        //task №1
        System.out.println("Задача №1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //task №2
        System.out.println("Задача №2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //task №3
        System.out.println("Задача №3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //homework2
        //task №4
        System.out.println("Задача №4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        //task №5
        System.out.println("Задача №5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        //homework3
        //task №6
        System.out.println("Задача №6");
        var weightOneBoxer = 78.2;
        var weightTwoBoxer = 82.7;
        var weightTwoFighters = weightOneBoxer + weightTwoBoxer;
        var differenceTwoFighters = weightTwoBoxer - weightOneBoxer;
        System.out.println("Общий вес боксёров " + weightTwoFighters + " кг.");
        System.out.println("Разница в весе бойцов " + differenceTwoFighters + " кг.");

        //task №7
        System.out.println("Задача №7");
        var differenceTwoFighters1 = weightTwoBoxer % weightOneBoxer;
        System.out.println("Разница в весе бойцов (1-й способ) " + differenceTwoFighters + " кг.");
        System.out.println("Разница в весе бойцов (2-й способ) " + differenceTwoFighters1 + " кг.");

        //task №8
        System.out.println("Задача №8");
        var amountHours = 640;
        var hoursPerEmployee = 8;
        var amountEmployee = amountHours / hoursPerEmployee;
        var moreEmployee = 94;
        var totalEmployee = amountEmployee + moreEmployee;
        var totalHours = totalEmployee * hoursPerEmployee;
        System.out.println("Всего работников в компании " + amountEmployee + " человек");
        System.out.println("Если в компании работает "  + totalEmployee + " человека, то всего " + totalHours + " часов работ может быть поделено между сотрудниками");
    }
}
