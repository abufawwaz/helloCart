package com.Suresh.darazEcommerce.ModalClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductCollectionModal {
    @SerializedName("tbl_product")
    @Expose
    List<DarazProductModalClass> darazProductModalClasses;

    public List<DarazProductModalClass> darazProductModalClasses() {
        return darazProductModalClasses;
    }

    public void setCollectionModalList(List<DarazProductModalClass> darazProductModalClasses) {
        this.darazProductModalClasses = darazProductModalClasses;
    }

    @Override
    public String toString() {
        return "ProductCollectionModal{" +
                "darazProductModalClasses=" + darazProductModalClasses +
                '}';
    }

}