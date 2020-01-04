package com.simant.darazclone_simant.ModalClass;

public class FlashModalClass {
    private int saleImage;
    private String amount;

    public String getSold() {
        return sold;
    }

    public void setSold(String sold) {
        this.sold = sold;
    }

    private String sold;

    public int getSaleImage() {
        return saleImage;
    }

    public void setSaleImage(int saleImage) {
        this.saleImage = saleImage;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public FlashModalClass(int saleImage, String amount, String sold) {
        this.saleImage = saleImage;
        this.amount = amount;
        this.sold = sold;
    }

}
