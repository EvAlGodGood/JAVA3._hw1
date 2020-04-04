package la;

import java.util.ArrayList;

public class MassGen<T> {
    private T[] mass;

    public MassGen(T... mass) {
        this.mass = mass;
    }

    public void swapEL(int i, int j) { //меняем местами два конкретных элемента экземляра класса
        mass [0] = mass [i];
        mass [i] = mass [j];
        mass [j] = mass [0];
    }

    public T getMass(int i) {
        return mass[i];
    }


    public void printMass() {//вывод массива в экземпляре класса
        for(int i=1;i<mass.length;i++){
            System.out.print(mass[i] +" ");
        }
        System.out.println();
    }

    public T getMassType() { //возьмем тип данных в конкретном экземпляре класса
        return (T) mass[0].getClass().getSimpleName();
    }

    //public void genArrList(){

       // ArrayList <getMassType()> arrayList = new ArrayList<>();

    //}

}
