package HW.interfaces;

public class TestClient {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager(new HyundaiMaker());
        manager.setMaker(new HyundaiMaker());
        manager.order(20000);
    }
}
