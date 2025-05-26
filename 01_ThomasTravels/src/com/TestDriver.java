package com;

import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {
       ArrayList<Driver> driverlist = new ArrayList<>();
       driverlist.add(new Driver(1, "jordan" , "Car" , 4500));
       driverlist.add(new Driver(2, "john" , "Bus" , 3500));
       driverlist.add(new Driver(3, "jack" , "Truck" , 4000));
       driverlist.add(new Driver(4, "jaspier" ,"Auto" ,1000));
       driverlist.add(new Driver(5, "joseph" , "Car" , 5500));
       
       Travel travel = new Travel();
       
       System.out.println("Is joseph is a Driver? : " +travel.isCarDriver(driverlist.get(0)));
	   System.out.print("\n"); 
       System.out.println(travel.retriveByDriverId(driverlist, 3));
       System.out.println("\n"
       		+ "Count of Car Drivers:");
       System.out.println(travel.retriveCountOfDriver(driverlist,"Car"));
       
       
       ArrayList<Driver> carDrivers = travel.retriveDriver(driverlist, "Car");
       
       System.out.println("\nList of Car Drivers: ");
       for(Driver d : carDrivers) {
    	   System.out.println(d.getDriverName());
       }
       
       Driver maxDriver = travel.retriveMaximumDistanceDistanceTravelledDriver(driverlist);
       System.out.println("\nDriver with max distance " + maxDriver.getDriverName() + " - " + maxDriver.getTotalDistance() + " KM");
 }
}
