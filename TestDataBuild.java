package resources;

import java.util.ArrayList;
import java.util.List;

import io.restassured.specification.RequestSpecification;
import pojo.Add_Place_Serialization_Concept;
import pojo.Location;


public class TestDataBuild {
	
	RequestSpecification req;

	
public Add_Place_Serialization_Concept addPlace(String name, String address, String language)

{
	Add_Place_Serialization_Concept add = new Add_Place_Serialization_Concept();

	List<String> type = new ArrayList<String>();

	type.add("Start up");

	type.add("SME");
	type.add("MNC");
	add.setAccuracy(1234);
	add.setName(name);
	add.setLanguage(language);
	add.setPhone_number(2110628907);
	add.setWebsite("https://rahulshettyacademy.com/");

	add.setTypes(type);
	add.setAddress(address);

	Location l = new Location();
	l.setLat(33.67);
	l.setLng(56.56);
	add.setLocation(l);
	
	return add;

}


}
