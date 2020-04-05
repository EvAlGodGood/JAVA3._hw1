package la;

public class App {
    public static void main(String args[]) {
        MassGen<Integer> intMass = new MassGen<Integer>(0, 1, 2, 3, 4, 5); //[0] элемент вместо буфера
        MassGen<String> strMass = new MassGen<String>("", "a", "b", "c", "d", "e");
        MassGen<Float> floMass = new MassGen<Float>(0f, 0.25f, 1.5f, 2.5f, 1.1f, 0.125f);
        MassGen<Cat> cats = new MassGen<Cat>(new Cat(""),new Cat("Мурзик"),
                new Cat("Василий"),new Cat("Бузя"));

        intMass.printMass();
        strMass.printMass();
        floMass.printMass();
        cats.printMass();

        intMass.swapEL(3, 4);
        strMass.swapEL(1, 5);
        floMass.swapEL(1, 4);
        cats.swapEL(1, 3);

        intMass.printMass();
        strMass.printMass();
        floMass.printMass();
        cats.printMass();

        System.out.println(intMass.genArrList()); //вывод всего списка
        System.out.println(strMass.genArrList());
        System.out.println(floMass.genArrList());
        System.out.println(cats.genArrList());

        System.out.println(intMass.genArrList().get(3)); //вывод конкретного элемента массива
        System.out.println(strMass.genArrList().get(4));
        System.out.println(floMass.genArrList().get(1));
        System.out.println(cats.genArrList().get(0));


        System.out.println("Какая клевая штука дженерик!!!");
    }


//        System.out.println(intMass.getMassType());
//        System.out.println(strMass.getMassType());
//        System.out.println(floMass.getMassType());

}


