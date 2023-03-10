package com.frankbenchdemo.providerservice.controller;

import com.frankbenchdemo.providerservice.entity.LocationRequest;
import com.frankbenchdemo.providerservice.entity.ProviderEntity;
import com.frankbenchdemo.providerservice.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.config.SpringIntegrationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/providers")
public class ProviderController {

    @Autowired
    private ProviderRepository providerRepository;

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<ProviderEntity> getAllProviders() {
        return providerRepository.findAll();
    }

    @PostMapping("/saveProvider")
    @ResponseStatus(HttpStatus.OK)
    public void createProvider(@RequestBody ProviderEntity productEntity) {
        providerRepository.save(productEntity);
    }

    @PostMapping("/getByLocation")
    @ResponseStatus(HttpStatus.OK)
    public List<ProviderEntity> getByLocation(@RequestBody LocationRequest location) {
        System.out.println(location.getLocation());
        return providerRepository.findProviderEntityByLocation(location.getLocation());
    }
}
