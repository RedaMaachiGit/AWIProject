package util;

import com.google.gson.annotations.SerializedName;

public class OutProduct {
	
    @SerializedName("idProduct") Integer idProduct;
    @SerializedName("idSeller") String idSeller;
    @SerializedName("nameProduct") String nameProduct;
    @SerializedName("descriptionProduct") String descriptionProduct;
	@SerializedName("priceSeller") Double priceSeller;
	@SerializedName("quantityStock") Integer quantityStock;
	@SerializedName("imageProduct") String imageProduct;
	@SerializedName("shoppingCart") String shoppingCart;
	@SerializedName("language") String language;
}