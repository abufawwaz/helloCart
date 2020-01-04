package com.simant.darazclone_simant.InterfaceClasses;

import com.simant.darazclone_simant.ModalClass.ProductCollectionModal;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    // url
    @GET("simant_daraz_product_api.php")
    Call<ProductCollectionModal> parseProduct();
}
