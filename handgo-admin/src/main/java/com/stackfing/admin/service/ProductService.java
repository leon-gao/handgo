package com.stackfing.admin.service;

import com.stackfing.admin.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductByTypeId(Long typeId);

}
