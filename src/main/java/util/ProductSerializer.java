package util;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ProductSerializer implements JsonSerializer<OutProduct> {
    public JsonElement serialize(final OutProduct product, final Type type, final JsonSerializationContext context) {
	        JsonObject result = new JsonObject();
	        result.add("idProduct", new JsonPrimitive(product.idProduct));
	        result.add("idSeller", new JsonPrimitive(product.idSeller));
	        result.add("nameProduct", new JsonPrimitive(product.nameProduct));
	        result.add("descriptionProduct", new JsonPrimitive(product.descriptionProduct));
	        result.add("priceSeller", new JsonPrimitive(product.priceSeller));
	        result.add("quantityStock", new JsonPrimitive(product.quantityStock));
	        result.add("imageProduct", new JsonPrimitive(product.imageProduct));
	        result.add("shoppingCart", new JsonPrimitive(product.shoppingCart));
	        return result;
	}
}
