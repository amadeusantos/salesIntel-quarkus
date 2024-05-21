package com.salesintel.repository;

import com.salesintel.model.SalesProducts;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.UUID;

public class SalesProductsRepository implements PanacheRepositoryBase<SalesProducts, UUID> {
}
