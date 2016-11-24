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
	public static void main(String[] args) throws IOException, JSONException {
		JSONArray json = readJsonArrayFromUrl("https://sellbook-polytech.eu-gb.mybluemix.net/products");
		System.out.println(json.toString());
		System.out.println(((JSONObject) json.get(0)).get("idProduct"));
	}
}
