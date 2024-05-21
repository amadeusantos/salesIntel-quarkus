package com.salesintel.repository;

import com.salesintel.model.Sale;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.UUID;

public class SaleRepository implements PanacheRepositoryBase<Sale, UUID> {
}
