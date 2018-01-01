package model;

import java.util.ArrayList;
import model.Room;

public class Hotel {

private ArrayList<Room> room; // array list
private String name;
private String location;
private int occupiedcnt ;
private int numofRooms;

private static int NOT_FOUND =-1;
Hotel()
{
	 room = new ArrayList<>();
	this.name ="";
	this.location="";
	this.occupiedcnt=0;
	this.numofRooms=0;
	

}

Hotel(String name , String location)
{
	this.name = name;
	this.location= location;
	 room = new ArrayList<>();

	 
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

//pass the reference of Room ex- Room
/*
public void addRoom(int roomNum, String bedType, char smoking ,double rate)
{

	Room r = new Room( roomNum,  bedType,  rate,  smoking);
	
	//connections
	
	
	
	System.out.println(r.toString()+""+r.getBedType());

	room[numofRooms] =r;
	numofRooms++;
	r.setOccupied(false);
	
}*/


public boolean isFull()
{
	return false;
}
public boolean isEmpty()
{
	return false;
}


public void  addReservation(String occupantName ,  char smoking,String bedType)
{
	
	int check=0;
	for(Room x : this.room)
	{
	  if( x.getBedType()== bedType && x.getSmoking() == smoking  && x.isOccupied()==false  )
	  {
		  x.setOccupantName(occupantName);
		  x.setOccupied(true);
		  occupiedcnt++;
		  
		  System.out.println("your booking is successful" + occupantName);
		  check =1;
	  }
	  
	  else
	  {
		  
		  //check=1;
	  }
	  
	 }
	
	
	if (check ==1)
	{
		
		System.out.println("Your booking was not successful");
		//check =0;
	}
       

 }

public int findReservation(String occupant_name )
{
    int index =0, check=0;
	for (Room r : room)
	{
		if (r.getOccupantName()== occupant_name && r.isOccupied()==true )
		{
			return r.getRoomNumber();
			
		}
		
		else
		{
			
			check=1;
	
		}
		
	}
	
	if (check ==1)
	{
	return index = NOT_FOUND;
	
	}
	
	return index;

}


  public  int findReservationIndex(String occupant_name)
 {
	  int index=0, check=0;
	  for (int i = 0; i < room.size(); i++) {
		Room r = room.get(i); /// where i is index;
		if (r.getOccupantName().equals(occupant_name))
		{
			index=i;
			return index;
			
		}
		else 
		{
			
			check =1;
		}
		
		
	}
      if (check == 1)
      {
    	  
    	  System.out.println(" reservation was " + occupant_name + "was not there");
    	  
    	  check =0;
    	  index = NOT_FOUND;
      }
      
     return index; 

 }
  
  
 public void cancelReservation(String Occupant_name)
 { 
	 int i = findReservationIndex(Occupant_name  );
	     if (i > 0)
	     {
	    	 
	    	Room r = room.get(i) ;
	    	r.setOccupied(false);
	    	occupiedcnt--;
	    	
	    	
	     }
	 
	 
	 
 }
 
public void printReservationList() 
{
	
	for (Room r : room)
	{
		if(r.isOccupied()==true)
		{
			
			System.out.println(r.getOccupantName());
			System.out.println(r.getRoomNumber());
			System.out.println(r.getRoomRate());
			System.out.println(r.getSmoking());
			
			
		}
		
	}
	
}

public double	getDailySales() {
	
	double count=0 ,sum =0;
	
	for(Room r : room)
	{
	if (r.isOccupied()==true) {
		
		sum+=r.getRoomRate();
		
	}
	}
	return sum;
}

public double	occupancyPercentage() {
	
	double per=0;
	
	for (Room r : room)
	{
		
		if (r.isOccupied()== true) {
			
			per =( numofRooms/occupiedcnt)* 100;
		}
	}
	
	System.out.println(per);
	
	System.out.println(( numofRooms/occupiedcnt)* 100);
	
	return per;
}
  
  





}




	
	



