package org.example.VehicleGarageSystem.Vehicles;

import java.util.Date;

public abstract class Vehicle {
    public Vehicle(String regNo, VehicleType type, float engineSize, double maintenanceFee) {
        this.regNo = regNo;
        this.type = type;
        this.engineSize = engineSize;
        this.maintenanceFee = maintenanceFee;
    }

    String regNo;
    VehicleType type;
    float engineSize;
    double maintenanceFee;

    public String getRegNo() {
        return regNo;
    }
    public VehicleType getType() {
        return type;
    }
    public float getEngineSize() {
        return engineSize;
    }
    public double getMaintenanceFee() {
        return maintenanceFee;
    }
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }
}
