package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
    }

    public void start() {
        if(this.tachometer == 0){
            this.tachometer = 1000;
            System.out.println("Vehiculo acendido");
        }else{
            System.out.println("El vehiculo ya esta acendido");
        }
    }

    public void stop() {
        if(this.speedometer == 0){
            this.tachometer = 0;
            System.out.println("Vehiculo apagado");
        }else{
            System.out.println("No se puede apagar el vehiculo porque tiene que estar detenido");
        }
    }

    public void accelerate() {
        if (this.speedometer < MAX_SPEED) {
            this.speedometer += 5;
            System.out.println("Velocidad actual: " + this.speedometer);
        } else {
            this.speedometer = MAX_SPEED;
            System.out.println("Ya has alcanzado la velocidad maxima");
        }
    }

    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 5;
            System.out.println("Velocidad actual: " + this.speedometer);
        } else {
            this.speedometer = 0;
            System.out.println("El coche ya esta detenido");
        }

    }

    public void turnAngleOfWheels(int angle) {
        int angle2 = this.wheelsAngle + angle;
        if (angle2 > 45) {
            this.wheelsAngle = 45;
        } else if (angle2 < -45) {
            this.wheelsAngle = -45;
        } else {
            this.wheelsAngle = angle2;
        }
        System.out.println("Angulo actual de las ruedas: " + this.wheelsAngle + "°");
    }

    public String showSteeringWheelDetail(){
        return "Angulo del volante: " + this.wheelsAngle + "°";
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (this.speedometer == 0) {
            this.reverse = reverse;
            if (reverse) {
                this.gear = "R";
            } else {
                this.gear = "N";
            }
            System.out.println("Marcha actual: " + this.gear);
        } else {
            System.out.println("No se puede cambiar a reversa mientras el coche esta en movimiento");
        }

    }

    public void showDetails() {
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Combustible: " + this.fuel);
        System.out.println("Velocidad actual: " + this.speedometer + " km/h");
        System.out.println("Tacometro: " + this.tachometer + " RPM");
        System.out.println("Marcha: " + this.gear);
        System.out.println("Reversa: " + (this.reverse ? "Si" : "No"));
        System.out.println("Angulo de las ruedas: " + this.wheelsAngle + "°");
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

}
