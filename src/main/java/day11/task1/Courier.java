package day11.task1;

public class Courier implements Worker {
    private static final int REWARD = 100;
    private static final int BONUS = 50000;
    private Warehouse warehouse;
    private int salary;
    private boolean isPayed;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        warehouse.increaseDeliveredOrdersCount(1);
        salary += REWARD;
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (warehouse.getCountDeliveredOrders() < Worker.COMPLETED_WORK) {
            System.out.println("Бонус пока не доступен");
        } else {
            salary += BONUS;
            isPayed = true;
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", warehouse.countDeliveredOrders=" + warehouse.getCountDeliveredOrders() +
                '}';
    }
}
