package com.salesintel.repository;

import com.salesintel.model.Establishment;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.UUID;

public class EstablishmentRepository implements PanacheRepositoryBase<Establishment, UUID> {
}
