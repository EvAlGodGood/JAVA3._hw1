package la.fruits;
//f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку
// фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается,
// а в другую перекидываются объекты, которые были в этой коробке;
//g. Не забываем про метод добавления фрукта в коробку.
public class BoxMoving {
    public static void main(String args[]) {
        Box<Orange> Box1 = new Box<Orange>(new Orange(),new Orange());
        Box<Apple> Box2 = new Box<Apple>(new Apple(),new Apple());
        Box<Orange> Box3 = new Box<Orange>(new Orange());
        Box<Apple> Box4 = new Box<Apple>(new Apple(),new Apple(),new Apple());

        Box1.printBox();
        System.out.println("Вес Box1 " + Box1.getWeightBox());
        Box2.printBox();
        System.out.println("Вес Box2 " + Box2.getWeightBox());
        Box3.printBox();
        System.out.println("Вес Box3 " + Box3.getWeightBox());
        Box4.printBox();
        System.out.println("Вес Box4 " + Box4.getWeightBox());

        System.out.println(Box1.compare(Box2));
        System.out.println(Box3.compare(Box2));
        System.out.println(Box3.compare(Box1));
        System.out.println(Box1.compare(Box4));

    }
}