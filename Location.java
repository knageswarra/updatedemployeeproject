package employee;

public class Location {
   String locationId;
   String city;
   int pincode;
   String country;
   
   void createLocation(String lid,String cit,int pin,String count)
   {
	   locationId=lid;
	   city=cit;
	   pincode=pin;
	   country=count;
	   
   }
   String getDetails()
   {
	   return " \nlocation details are "+"Locationid id :"+locationId+",City name:"+city+",pincode is:"+pincode+",country name is:"+country ;
   }
}
