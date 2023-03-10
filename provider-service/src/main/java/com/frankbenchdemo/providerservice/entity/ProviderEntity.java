package com.frankbenchdemo.providerservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "provider")
@Getter
@Setter
@NoArgsConstructor
public class ProviderEntity {
    @Id
    private String id;
    private String providerName;
    private String location;
}
