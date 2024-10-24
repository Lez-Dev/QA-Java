package org.example.VehicleGarageSystem.Vehicles;

public class Car extends Vehicle{

    public Car(String regNo, VehicleType type, float engineSize, double maintenanceFee) {
        super(regNo, VehicleType.CAR, engineSize, 35.00);
    }
}
