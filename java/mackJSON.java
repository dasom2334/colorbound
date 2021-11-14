package convert;

import java.awt.Color;
import java.awt.List;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.json.simple.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class mackJSON {
	public static void main (String args[]) {
		
		
		
		JSONArray arr = new JSONArray();
		

		
		
		mult(arr, "https://en.wikipedia.org/wiki/List_of_colors:_A–F", arr.size(), arr.size());
		System.out.println(arr.size());
		mult(arr, "https://en.wikipedia.org/wiki/List_of_colors:_G–M", arr.size(), arr.size());
		System.out.println(arr.size());
		mult(arr, "https://en.wikipedia.org/wiki/List_of_colors:_N–Z", arr.size(), arr.size());
		System.out.println(arr.size());
		System.out.println(arr);
		

		
		JSONParser parser = new JSONParser();
		try {
	 
			FileWriter file = new FileWriter("c:\\test.json");
			file.write(arr.toJSONString());
			file.flush();
			file.close();
			
			Object read = parser.parse(new FileReader("c:\\test.json"));
			//System.out.print(read);
	 
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	 



	}
	
	static void addJSON(JSONArray arr, Elements ele1, Elements ele2, int i, int j) {

		for(Element link : ele1) {
			arr.add(new JSONObject());
			((JSONObject)arr.get(i)).put("name", link.text());
			//System.out.println(link.text());
			i++;
		}
		for(Element link : ele2) {
			((JSONObject)arr.get(j)).put("R", Color.decode(link.text()).getRed());
			((JSONObject)arr.get(j)).put("G", Color.decode(link.text()).getGreen());
			((JSONObject)arr.get(j)).put("B", Color.decode(link.text()).getBlue());
			j++;
		}
		
	}
	
	static void mult(JSONArray arr, String str, int i, int j) {
		String exePath = "C:\\KDS\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		

		driver.get(str);
		String html = driver.getPageSource();
		Document doc = Jsoup.parse(html);
		Elements ele1 = doc.select("table.wikitable.sortable.jquery-tablesorter>tbody>tr>th");
		Elements ele2 = doc.select("table.wikitable.sortable.jquery-tablesorter>tbody>tr>td:nth-child(2)");
		//System.out.print(ele1.text());
		addJSON(arr, ele1, ele2, i, j);
		
		driver.quit();
	}
}
