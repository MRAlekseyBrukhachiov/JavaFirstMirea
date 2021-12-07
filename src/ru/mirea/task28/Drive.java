package ru.mirea.task28;

public class Drive {

    public void service(Car car) {
        for (int i = 0; i < 4; i++) {
            car.wheel[i].setPressure(2.5);
        }
        car.engine.setRpm(100);
    }

    public void diagnostics(Car car) {
        System.out.println("Обороты двигателя: "+car.engine.getRpm());
        System.out.println("Давление в шинах: ");

        for (int i = 0; i < 4; i++) {
            System.out.print(i+": "+car.wheel[i].getPressure());
            if (!car.wheel[i].checkWheel()) {
                System.out.println(" - колесо спущено");
            } else {
                System.out.println();
            }
        }

        if (!car.engine.checkEngine()) {
            System.out.println("Обнаружен перегрев двигателя!");
        }
    }

    public static void main(String[] args) {
        Drive drive = new Drive();
        Car car = new Car("Audi R8", "H665AB");
        System.out.println("Ваша машина "+car.getModel()+" с номером "+car.getNum());

        car.engine.start();
        drive.diagnostics(car);
        car.engine.setRpm(400);
        car.wheel[1].setPressure(0.5);
        car.wheel[3].setPressure(1.0);
        drive.diagnostics(car);
        drive.service(car);
        drive.diagnostics(car);
        car.engine.stop();
    }
}
