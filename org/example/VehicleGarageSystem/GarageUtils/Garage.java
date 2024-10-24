package org.example.VehicleGarageSystem.GarageUtils;


import org.example.VehicleGarageSystem.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    public Garage(int capacity) {
        this.capacity = capacity;
    }

    static List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public static void addVehicleToGarage() {
        // switch statement for vehicle type enum, creation of new vehicle, add to vehicle array UNLESS garage is full
        if(vehicles.size() == capacity) {
            System.out.println("Garage is full");
        }

        //Vehicle vehicle = new {
        //}
    }

    public static void userInput() {
        System.out.println("Please enter RegNo: ");
    }

    public static void listVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the garage.");
            return;
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println("RegNo: " + vehicle.getRegNo() + "\nVehicle Type: " + vehicle.getType() + "\nEngine size: " + vehicle.getEngineSize() + "\n\n");
        }
    }

    public static void calculateBill() {
        for (Vehicle vehicle : vehicles) {
            double fee = (vehicle.getMaintenanceFee() * vehicle.getEngineSize());
            System.out.println("RegNo: " + vehicle.getRegNo() + "Fee: £" + fee + "\n");
        }
    }

    static int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }




}
