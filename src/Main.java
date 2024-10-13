public class Main {

    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println("пес "  +  dog );
        var cat = 3.6;
        System.out.println("кот " + cat );
        var paper = 763789;
        System.out.println( "еж " + paper);
        dog = dog + 4;
        System.out.println( "пес " + dog);
        cat = cat + 4;
        System.out.println("кот " + cat);
        paper = paper + 4;
        System.out.println("еж " + paper);
        dog = dog - 3.5;
        System.out.println( "пес " + dog);
        cat = cat - 1.6;
        System.out.println("кот " + cat);
        paper = paper - 7639;
        System.out.println("еж " + paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerOneWeight = 78.2;
        var boxerTwoWeight = 82.7;
        var boxersWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println(boxersWeight);
        var boxerssWeight = boxerOneWeight - boxerTwoWeight;
        System.out.println(boxerssWeight);
        var booxersWqight = boxerTwoWeight % boxerOneWeight;
        System.out.println(booxersWqight);


        var time = 640;
        var ui = 8;
        var people = time / ui ;
        System.out.println("Всего работников в компании -  " + people +  " человек " );

        people = people + 94;
        System.out.println(people);
        var newPeople = time / people;
        System.out.println("Если в компании работает " + people + " человек, то всего " + newPeople + " часов работы может быть поделено между сотрудниками ");








    }
}