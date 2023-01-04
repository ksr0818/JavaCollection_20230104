package generic;

class Basket<T> {
    private T item;

    public Basket(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }


    //클래스 변수는 제네릭 불가
    class Static<T> {
        private T item1; // O
//        static  T item2; // X
    }


}


public class Generic {
    public static void main(String[] args) {

        Basket<String> basket1 = new Basket<>("Hello");
        Basket<Integer> basket2 = new Basket<>(10);
        Basket<Double> basket3 = new Basket<>(3.14);

    }

}

//상속관계로 정의할 경우 다형성 가능!
