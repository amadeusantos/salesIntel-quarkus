package com.salesintel.repository;

import com.salesintel.model.Product;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.UUID;

public class ProductRepository implements PanacheRepositoryBase<Product, UUID> {
}
