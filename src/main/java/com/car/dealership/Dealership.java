package com.car.dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private final String name;
    private final String address;
    private final String phone;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    private final ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }
    public List<Vehicle> getByPrice(double min, double max) {
        List<Vehicle> values = new ArrayList<Vehicle>();
        for(Vehicle i : inventory) {
            if(i.getPrice() >= min && i.getPrice() <= max) {
                values.add(i);
            }
        }
        return values;
    }
    public List<Vehicle> getByMakeModel(String make, String model) {
        List<Vehicle> values = new ArrayList<Vehicle>();
        for(Vehicle i : inventory) {
            if(i.getMake().equals(make) || i.getModel().equals(model)) {
                values.add(i);
            }
        }
        return values;
    }

    public List<Vehicle> getByYear(int min , int max) {
        List<Vehicle> values = new ArrayList<Vehicle>();
        for(Vehicle i : inventory) {
            if(i.getYear() >= min && i.getYear() <= max) {
                values.add(i);
            }
        }
        return values;
    }
    public List<Vehicle> getByColor(String color) {
        List<Vehicle> values = new ArrayList<Vehicle>();
        for(Vehicle i : inventory) {
            if(i.getColor().equals(color)) {
                values.add(i);
            }
        }
        return values;
    }
    public List<Vehicle> getByMileage(double min, double max) {
        List<Vehicle> values = new ArrayList<Vehicle>();
        for(Vehicle i : inventory) {
            if(i.getOdometer() >= min && i.getOdometer() <= max) {
                values.add(i);
            }
        }
        return values;    }
    public List<Vehicle> getByType(String vehicleType) {
        List<Vehicle> values = new ArrayList<Vehicle>();
        for(Vehicle i : inventory) {
            if(i.getVehicleType().equals(vehicleType)) {
                values.add(i);
            }
        }
        return values;
    }
    public  List<Vehicle> getAllVehicles() {
        return inventory;
    }
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }
}