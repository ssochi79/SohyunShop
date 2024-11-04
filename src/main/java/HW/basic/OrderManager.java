package HW.basic;

public class OrderManager {

    private HyundaiMaker hyundaiMaker;

    public OrderManager(){
        this.hyundaiMaker= new HyundaiMaker();
    }

    public void order(int cost){
        Money money = new Money(cost);
        Car car = hyundaiMaker.sell(money);
        System.out.println("판매상(인수) : "+ car.getName());
    }
}
