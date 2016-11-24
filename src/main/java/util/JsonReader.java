package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonReader {

	private static JSONArray json;
	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

	public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		InputStream is = new URL(url).openStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;
		} finally {
			is.close();
		}
	}

	public static JSONArray readJsonArrayFromUrl(String url) throws IOException, JSONException {
	    InputStream is = new URL(url).openStream();
	    try {
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));


	      String jsonText = readAll(rd);

	      JSONArray arr = new JSONArray(jsonText);

	      //System.out.println(arr.toString(2));

	      return arr;
	    } finally {
	      is.close();
	    }
	  }
	

	public static Integer getNumberOfProduct() throws IOException, JSONException{
		json = readJsonArrayFromUrl("https://sellbook-polytech.eu-gb.mybluemix.net/products");
		return json.length();
	}

	public static Object getIdProduct(Integer index) throws IOException, JSONException{
		return ((JSONObject) json.get(index)).get("idProduct");
	}
	
	public static Object getIdSeller(Integer index) throws IOException, JSONException{
		return ((JSONObject) json.get(index)).get("idSeller");
	}
	public static Object getNameProduct(Integer index) throws IOException, JSONException{
		return ((JSONObject) json.get(index)).get("nameProduct");
	}
	public static Object getDescriptionProduct(Integer index) throws IOException, JSONException{
		return ((JSONObject) json.get(index)).get("descriptionProduct");
	}
	public static Object getPriceSeller(Integer index) throws IOException, JSONException{
		return ((JSONObject) json.get(index)).get("priceSeller");
	}
	public static Object getQuantityStock(Integer index) throws IOException, JSONException{
		return ((JSONObject) json.get(index)).get("quantityStock");
	}
	public static Object getImageProduct(Integer index) throws IOException, JSONException{
		return ((JSONObject) json.get(index)).get("imageProduct");
	}
	
	public static void main(String[] args) throws IOException, JSONException {
		
		//System.out.println(json.toString());
		System.out.println(getNumberOfProduct());
		System.out.println(getNameProduct(0));
		System.out.println(getIdProduct(0));
		System.out.println(getIdSeller(0));
		System.out.println(getImageProduct(0));
		System.out.println(getPriceSeller(0));
		System.out.println(getQuantityStock(0));
		System.out.println(getDescriptionProduct(0));
		
	}
}