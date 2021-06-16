package com.wad.fils.course6.services;

import com.wad.fils.course6.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ProductServiceImpl implements ProductSV{
  List<Product> products = new ArrayList(List.of(
          new Product("car",5000)

  ));


  @Override
  public List<Product> findAll() {
    return products;
  }

  @Override
  public void save(Product p) {
    if(p.getId()==null)
      p.setId(new Random().nextLong());
    products.add(p);
  }
}
