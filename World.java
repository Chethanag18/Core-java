class World
{
	public static String country(int code)
	{
		System.out.println("code:"+code);
		if(code==91)
		{
			return "India";
		}
		else if(code==124)
		{
			return "Canada";
		}
		else if(code==064)                    
		{
			return "Bhutan";
		}
		else if(code==192)
		{
			return "Cuba";
		}
		else if(code==300)
		{
			return "Greece";
		}
		return "Not found";
	}
	public static double price(String item)
	{
		System.out.println("Item:"+item);
		if(item=="White sauce Pasta")
		{
			return 180;
		}
		else if(item=="Tacos")
		{
			return 150.98;
		}
		else if(item=="Chow Mein")
		{
			return 149.89;
		}
		else if(item=="Dal Makhani")
		{
			return 139.78;
		}
		else if(item=="Dose")
		{
			return 150.98;
		}
		return 0;
		
	}
	public static String producer(String movieName)
	{
		System.out.println("MovieName:"+movieName);
		if(movieName=="Brahmastra")
		{
			return "Karan Johar";
		}
		else if(movieName=="Hridayam")
		{
			return "Visakh Subramaniam";
		}
		else if(movieName=="Dia")
		{
			return "Krishna Chaithanya";
		}
		else if(movieName=="Tappad")
		{
			return "Bhushan Kumar";
		}
		else if(movieName=="The Great Indian Kitchen")
		{
			return "Vishnu rajan";
		}
		return "Not Found";
    }
}