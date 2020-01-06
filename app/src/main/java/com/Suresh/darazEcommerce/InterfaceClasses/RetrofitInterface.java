package com.Suresh.darazEcommerce.InterfaceClasses;

import com.Suresh.darazEcommerce.ModalClass.ProductCollectionModal;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    // url
    @GET("darazEcommerce_product_api.php")
    Call<ProductCollectionModal> parseProduct();
}
