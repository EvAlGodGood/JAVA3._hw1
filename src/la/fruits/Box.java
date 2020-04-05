package la.fruits;

import java.util.ArrayList;

public class Box<T> {
    private T[] ms;

    public Box (T... ms) {
        this.ms = ms;
    }

//    public ArrayList arrBox (){ //зачем он? для реализации добавления обектов?, а напрямую в массив дописать можно?
//        ArrayList <T> arrListMass = new ArrayList<>();
//        for (int i=0; i<ms.length; i++){
//            arrListMass.add(ms[i]);
//        }
//        return arrListMass;
//    }

    public void printBox() {//вывод массива в экземпляре класса
        for(int i=0;i<ms.length;i++){
            System.out.print(ms[i] + " ");
        }
        System.out.println();
    }

    public Float getWeightBox() {//вывод массива в экземпляре класса
        float summ = 0;
        for(int i=0;i<ms.length;i++){
            summ += Float.valueOf(ms[i].toString());
        }
        return summ;
    }

    public boolean compare (Box b){
        return Math.abs(getWeightBox() - b.getWeightBox()) < 0.00000000001;
        //return getWeightBox()==b.getWeightBox();
    }

    public void putInBox(Box c){ //добавить фрукт в коробку?

    }

    public void pourFruit(){ //пересыпать фрукты из коробки в коробку

    }



}
