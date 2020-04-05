package la;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString(){ //а вот так!!! учим JAVA выводить в имени объект, показав name поле, но это не совсем то.
        // как getter использовать?
        return String.format(name);
    };


//    public String getN() { //если мы запихали котов в список при помощи дженерика создали массив как выудить имя?
//        return name;
//    }

}
