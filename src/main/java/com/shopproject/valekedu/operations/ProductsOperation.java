package com.shopproject.valekedu.operations;

import com.shopproject.valekedu.goods.BaseGoods;

public class ProductsOperation {
    public void addNewProduct(String title, String pictureLink, double price, int quantity) {
        BaseGoods newItem= new BaseGoods(title, price, quantity, pictureLink);
    }
    public int deleteProduct() {
        return 0;
    }
}
