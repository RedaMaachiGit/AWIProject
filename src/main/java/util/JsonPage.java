package util;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
public class JsonPage {

public static void main(String[] args) throws Exception {

    String jsonFromUrl = UrlParse.readUrl("https://sellbook-polytech.eu-gb.mybluemix.net/products");
    String json = "[{\"idProduct\":\"6\",\"idSeller\":\"6\",\"nameProduct\":\"okok\",\"descriptionProduct\":\"ok\",\"priceSeller\":\"0.009999999776482582\",\"quantityStock\":\"0\",\"imageProduct\":\"null\",\"shoppingCart\":\"[]\"}]";
    System.out.println(OutProduct.class); // TRACE
    Gson gson = new GsonBuilder().registerTypeAdapter(OutProduct.class, new ProductSerializer()).create();
    Type listType = new TypeToken<ArrayList<Map<String, OutProduct>>>() {}.getType();

    
    
    
    System.out.println(gson.fromJson(jsonFromUrl, listType));
    System.out.println(listType); // TRACE
    
    ArrayList<OutProduct> page = gson.fromJson(json, listType);
    
    
    
    

    
//    ArrayList<Map<String, OutProduct>> searchResultList = new Gson().fromJson(json, listType);
    //System.out.println(searchResultList);


    System.out.println(page);
    //for (OutProduct item : page.items)
    //    System.out.println("    " + item.idProduct);

	}
}