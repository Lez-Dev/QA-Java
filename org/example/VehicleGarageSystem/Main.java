package org.example.VehicleGarageSystem;

import org.example.VehicleGarageSystem.GarageUtils.Garage;
import org.example.VehicleGarageSystem.Vehicles.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage garage = createGarage();




    }

    public static Garage createGarage(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter capacity of your garage: ");
        String input = scanner.nextLine();
        int capacity = Integer.parseInt(input);

        return new Garage(capacity);
    }




}
