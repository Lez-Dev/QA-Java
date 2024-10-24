package org.example.VehicleGarageSystem.Vehicles;

public class Van extends Vehicle{
    public Van(String regNo, VehicleType type, float engineSize, double maintenanceFee) {
        super(regNo, VehicleType.VAN, engineSize, 50.00);
    }
}
