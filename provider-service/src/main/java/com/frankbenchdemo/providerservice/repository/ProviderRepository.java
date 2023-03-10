package com.frankbenchdemo.providerservice.repository;

import com.frankbenchdemo.providerservice.entity.ProviderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProviderRepository extends MongoRepository<ProviderEntity, String> {
    public List<ProviderEntity> findProviderEntityByLocation(String location);
}
