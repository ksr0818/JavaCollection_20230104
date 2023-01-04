package generic;

class Flower { }
class Rose extends Flower {  }
class RosePasta {  }

// 제네릭 클래스 정의
class Basket2<T extends Flower> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
public class Example {
    public static void main(String[] args) {
        Basket2<Flower> flowerBasket = new Basket2<>();
        flowerBasket.setItem(new Rose());      // 다형성 적용
//        flowerBasket.setItem(new RosePasta()); // 에러

        Basket2<Flower> flowerBasket2 = new Basket2<>();
        Basket2<Rose> roseBasket2 = new Basket2<>();
//        Basket2<RosePasta> rosePastaBasket = new Basket2<>();



    }

}
