package com.split;
         class Vehicle{
        	  String manufacturer;
        	  int speed;
        	  int year;

        	  public int getYear() {
        	    return year;
        	  }

        	  public void setYear(int year) {
        	    this.year = year;
        	  }

        	  public String getManufacturer() {
        	    return manufacturer;
        	  }

        	  public void setManufacturer(String manufacturer) {
        	    this.manufacturer = manufacturer;
        	  }

        	  public int getSpeed() {
        	    return speed;
        	  }

        	  public void setSpeed(int speed) {
        	    this.speed = speed;
        	  }

        	  public void accelarate() {
        	    this.speed += 5;
        	  }

        	  public void brake() {
        	    this.speed -= 5;
        	  }
        	  
        	  public void print()
        	  {
        		  System.out.println("Vehicle company :"+this.getManufacturer());
        		  System.out.println("Name of vehicle :"+this.getYear());
        		  System.out.println("Speed of vehicle :"+this.getSpeed());
        	  }
         }
public class Vehicle_Q6 {
	

		  public static void main(String[] args) {
		    Vehicle rickshaw = new Vehicle();
		    rickshaw.setYear(2022);
		    rickshaw.setManufacturer("SomeCompany");
		    rickshaw.setSpeed(3);
		    Vehicle bike = new Vehicle();
		    
		    
		    System.out.println();
		    bike.setYear(2019);
		    bike.setManufacturer("Some Company");
		    bike.setSpeed(25);
		    
		    rickshaw.print();
		    
		    bike.print();
		    
		    for (int i = 1; i < 6; i++) {
		      bike.accelarate();
		      rickshaw.accelarate();
		      System.out.println(
		        "Bike speed after " + i + "th accelariton : " + bike.getSpeed()
		      );
		      System.out.println(
		        "Rickshaw speed after " + i + "th accelariton : " + rickshaw.getSpeed()
		      );
		    }
		    
		    
		    for(int i = 1 ; i < 3;i++){
		        bike.brake();
		        rickshaw.brake();
		        System.out.println(
		          "Bike speed after " + i + "th brake : " + bike.getSpeed()
		        );
		        System.out.println(
		          "Rickshaw speed after " + i + "th brake : " + rickshaw.getSpeed()
		        );
		    }
		  
		  }
}
