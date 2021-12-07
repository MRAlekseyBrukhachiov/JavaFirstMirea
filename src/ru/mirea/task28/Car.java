package ru.mirea.task28;

public class Car {

    private String num, model;
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];

    public Car(String model, String num) {
        this.num = num;
        this.model = model;
        for(int i = 0; i < 4; i++) {
            wheel[i] = new Wheel();
        }
    }

    public String getNum() {
        return num;
    }

    public String getModel() {
        return model;
    }

    public void beep() {
        System.out.println("BEEP! BEEP! BEEP!");
    }

    class Engine {

        private boolean start;
        private int rpm = 0;

        public int getRpm() {
            return rpm;
        }

        public void setRpm(int rpm) {
            this.rpm = rpm;
        }

        public void start() {
            start = true;
            rpm = 100;
        }

        public boolean checkEngine() {
            if (rpm > 200) {
                return false;
            }
            return true;
        }

        public void stop() {
            start = false;
            rpm = 0;
        }
    }

    class Wheel {

        private double pressure = 2.5;

        public void setPressure(double pressure) {
            this.pressure = pressure;
        }

        public double getPressure() {
            return pressure;
        }

        public boolean checkWheel() {
            if (pressure < 2) {
                return false;
            }
            return true;
        }
    }
}
