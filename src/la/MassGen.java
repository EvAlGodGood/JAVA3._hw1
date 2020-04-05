package la;

import java.util.ArrayList;

public class MassGen<T> {
    private T[] mass;

    public MassGen(T... mass) {
        this.mass = mass;
    }

    public void swapEL(int i, int j) { //меняем местами два конкретных элемента массива внутри экземляра класса
        mass [0] = mass [i];
        mass [i] = mass [j];
        mass [j] = mass [0];
    }

    public T getMass(int i) { //берем элемент массива из созданного экземпляра класса
        return mass[i];
    }


    public void printMass() {//вывод массива в экземпляре класса
        for(int i=1;i<mass.length;i++){
            System.out.print(mass[i] +" ");
        }
        System.out.println();
    }

    public ArrayList genArrList (){ //забиваем лист элементами массива
        ArrayList <T> arrListMass = new ArrayList<>();
        for (int i=1; i<mass.length; i++){ //c 1 тк [0] буфер для свапа
            arrListMass.add(mass[i]);
        }
        return arrListMass;
    }

//    public T getMassType() { //возьмем тип данных в конкретном экземпляре класса
//        return (T) mass[0].getClass().getSimpleName();
//    }

    //public void genArrList(){

       // ArrayList <getMassType()> arrayList = new ArrayList<>();

    //}

}
