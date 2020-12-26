package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.hotel.FoodDTO;
import com.xworkz.xworkzapp.hotel.Hotel;
import com.xworkz.xworkzapp.hotel.HotelDTO;

public class HotelUtil {
	public static void main(String[] args) {
		Hotel hotel=new Hotel(2);
		HotelDTO hotelDTO=new HotelDTO(1);
		hotelDTO.setHotelName("nk");
		hotelDTO.setLocation("Banglore");
		hotelDTO.setName("nr");
		hotelDTO.setService("self service");
		hotelDTO.setType("veg");
		
		
		

	FoodDTO foodDTO=new FoodDTO(1);
	foodDTO.setSweetName("rasagulla");
	foodDTO.setSweetName1("peda");
	foodDTO.setSweetname2("jamun");
	foodDTO.setTypeOfDal("toor dal");
	foodDTO.setTypeOfFood("veg");
	foodDTO.setTypeOfRice("chitanna");
	foodDTO.setNumberOfSweets(20);
	foodDTO.setNumberOfTypeOfRice(10);
	foodDTO.setNoOftypeOfVariety(50);
	foodDTO.setTiffin("poori");
	
hotel.addHotelDetails(hotelDTO);
hotel.addFoodDetails(foodDTO);
hotel.displayFoodDetails();
hotel.displayHotelDetails();
	
	
		
	}
	

}
