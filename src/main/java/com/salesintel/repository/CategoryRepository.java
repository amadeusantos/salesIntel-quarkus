package com.salesintel.repository;

import com.salesintel.model.Category;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.UUID;

public class CategoryRepository implements PanacheRepositoryBase<Category, UUID> {
}
