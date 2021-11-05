package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        // Создадим склад Альфа и его сотрудников
        Warehouse warehouseAlpha = new Warehouse();
        Picker pickerAlpha1 = new Picker(warehouseAlpha);
        Picker pickerAlpha2 = new Picker(warehouseAlpha);
        Courier courierAlpha1 = new Courier(warehouseAlpha);

        // Проверим логику для недоступного бонуса
        pickerAlpha1.bonus();
        System.out.println();

        // Выполним необходимую работу
        businessProcess(pickerAlpha1);
        businessProcess(courierAlpha1);

        System.out.println("После выполнения необходимого объема работ:");
        System.out.println(pickerAlpha1);
        System.out.println(courierAlpha1);
        System.out.println();

        // Проверим логику методов после выплаты бонуса pickerAlpha1
        System.out.println("Для сотрудника pickerAlpha1:");
        pickerAlpha1.doWork();
        pickerAlpha1.bonus();
        System.out.println(pickerAlpha1);
        System.out.println();

        // Проверим начисление ранее невыплаченного бонуса pickerAlpha2
        System.out.println("Для сотрудника pickerAlpha:");
        System.out.println(pickerAlpha2);
        pickerAlpha2.bonus();
        System.out.println(pickerAlpha2);
        System.out.println();

        // Создадим другой склад и сотрудников
        Warehouse warehouseBeta = new Warehouse();
        Picker pickerBeta = new Picker(warehouseBeta);
        Courier courierBeta = new Courier(warehouseBeta);

        // Выполним работу на скаладе B
        System.out.println("Состояние склада warehouseAlpha до:");
        System.out.println(warehouseAlpha);
        pickerBeta.doWork();
        courierBeta.doWork();

        // Проверим, что это не повлияло на склад Альфа
        System.out.println("Состояние склада warehouseAlpha после:");
        System.out.println(warehouseAlpha);
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < Worker.COMPLETED_WORK; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
