package jsonproject;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadData {

	public static void main(String[] args) throws Exception {
		
		/*File f=new File("weather.json");
		System.out.println(f.getAbsolutePath());*/
		
		JSONParser jsonparser= new JSONParser();
		FileReader reader=new FileReader("weather.json");
		
		Object obj=jsonparser.parse(reader);
		JSONObject weatherobj=(JSONObject)obj;
		
		JSONArray weather=(JSONArray)weatherobj.get("WeatherData");
		Double d=0.0;
		String s="";
		for(int i=0;i<weather.size();i++)
		{
			JSONObject data=(JSONObject)weather.get(i);
			
			String date=(String) data.get("date"); 
			System.out.println("WEATHER REPORT OF "+date);
			JSONArray cityarray=(JSONArray)data.get("City");
			
			for(int j=0;j<cityarray.size();j++)
			{
				JSONObject citydata=(JSONObject)cityarray.get(j);
				
				String name=(String) citydata.get("name");
				System.out.println(name);
				
				JSONObject report=(JSONObject) citydata.get("weather");
				Double min=(Double)report.get("temp_min");
				Long humidity=(Long)report.get("humidity");
				Double max=(Double)report.get("temp_max");
				
				if(humidity>90)
					System.out.println("Humidity is "+humidity+". Chances of rain are HIGH");
				else if(humidity>80 && humidity<=90)
					System.out.println("Humidity is "+humidity+". Chances of rain are MEDIUM");
				else
					System.out.println("Humidity is "+humidity+". Chances of rain are LOW");
				
				System.out.println(min);
				System.out.println(max);
				
				if(j==0) {
					d=max;
					s=name;}
				else {
					if(d<max) {
						System.out.println(name+" is hotter");
					}
					else {
						System.out.println(s+" is hotter");
					}
				}
				
			}
			
			System.out.println();
			System.out.println();
			System.out.println();
			
		}
		
		

	}

}
