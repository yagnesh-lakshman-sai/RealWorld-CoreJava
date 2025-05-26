package com;

import java.util.ArrayList;

public class Travel {
  public boolean isCarDriver(Driver d) {
	  return d.getCategory().equalsIgnoreCase("Car");
  }
  
  public String retriveByDriverId(ArrayList<Driver>list,int driverId) {
	  for(Driver d : list) {
		  if(d.getDriverId() == driverId) {
			  return "Driver name is " + d.getDriverName() + " Belonging to the category " + d.getCategory() + "traveled " + d.getTotalDistance() + "KM so far.";
		  }
	  }
	  return "Driver not found.";
  }
  
  public int retriveCountOfDriver(ArrayList<Driver>list , String category ) {
	  int count =0;
	  for(Driver d : list) {
		  if(d.getCategory().equalsIgnoreCase(category)) {
			  count++;
		  }
  }
	  return count;
}
  
  public ArrayList<Driver> retriveDriver(ArrayList<Driver>list , String category) {
	  ArrayList<Driver> result = new ArrayList<>();
	  for(Driver d : list) {
		  if(d.getCategory().equalsIgnoreCase(category)) {
			  result.add(d);
		  }
	  }
	  return result;
  }
  
  public Driver retriveMaximumDistanceDistanceTravelledDriver(ArrayList<Driver>list) {
	 if(list.isEmpty()) return null;
	 
	 Driver maxDriver = list.get(0);
	 for(Driver d : list) {
		 if(d.getTotalDistance() > maxDriver.getTotalDistance()) {
			 maxDriver =d;
		 }
	 }
	 return maxDriver;
  }
}
