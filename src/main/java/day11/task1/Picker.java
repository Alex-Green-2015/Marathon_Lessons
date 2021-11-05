package day11.task1;

public class Picker implements Worker {
    private static final int REWARD = 80;
    private static final int BONUS = 70000;
    private Warehouse warehouse;
    private int salary;
    private boolean isPayed;

    public Picker(Warehouse warehouse) {
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
        warehouse.increasePickedOrdersCount(1);
        salary += REWARD;
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (warehouse.getCountPickedOrders() < Worker.COMPLETED_WORK) {
            System.out.println("Бонус пока не доступен");
        } else {
            salary += BONUS;
            isPayed = true;
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", warehouse.countPickedOrders=" + warehouse.getCountPickedOrders() +
                '}';
    }
}
