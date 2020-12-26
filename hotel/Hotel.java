package com.xworkz.xworkzapp.hotel;

public class Hotel {
	public HotelDTO hotelDTO[];
	public FoodDTO foodDTO[]=new FoodDTO[10];
	public int currentIndex; 

	
	public Hotel(int size)
	{
		hotelDTO=new HotelDTO[size];
	
		
	}
	public void addHotelDetails(HotelDTO hotelDTO)
	{
		if(hotelDTO!=null)
	
	{
		System.out.println("inside the add adddetais");
		this.hotelDTO[currentIndex++]=hotelDTO;
		
	}
		else if(hotelDTO==null)
		{
			System.out.println("please add ");
		}
	
	}
	
	
	public void addFoodDetails(FoodDTO foodDTO )
	{
		if(foodDTO!=null)
		{
			System.out.println("inside the food details");
			this.foodDTO[currentIndex++]=foodDTO;
			
		}
		else if(foodDTO==null)
		{
		System.out.println("please add food details");	
		}
		
	}
	
public void displayHotelDetails()
{
	for(int i=0;i<hotelDTO.length;i++)
	{
	if(hotelDTO[i]!=null)
	{
		System.out.println(hotelDTO[i].getName()+" "+hotelDTO[i].getLocation()+" "+hotelDTO[i].getHotelName()+" "+hotelDTO[i].getType()+" "+hotelDTO[i].getService());
	}
	else if(hotelDTO[i]==null)
	{
		System.out.println("there is no details");
	}
	}
}
public void displayFoodDetails()
{
	for(int i=0;i<foodDTO.length;i++)
	{
	if(foodDTO[i]!=null)
	{
		System.out.println(foodDTO[i].getSweetName()+" "+foodDTO[i].getSweetName1()+" "+foodDTO[i].getSweetName2()+" "+foodDTO[i].getTypeOfDal()+" "+foodDTO[i].getTypeOfRice()+" "+foodDTO[i].getTiffinName()+" "+foodDTO[i].getNumberOfSweets()+" "+foodDTO[i].getNumberOfTypeOfRice()+" "+foodDTO[i].getNoOftypeOfVariety()+" "+foodDTO[i].getTypeOfFood());
	}
	else if(foodDTO[i]==null)
	{
		System.out.println("there is no details");
	}
	}
}
public void searchHotelsByLocationAndName(String location,String name)
{
	for(int i=0;i<foodDTO.length;i++)
	{
	if(foodDTO[i]!=null)
	{
	
	}
	else if(foodDTO[i]==null)
	{
		System.out.println("there is no details");
	}
	}
}
}
