package org.scutsu.materialmanagement.backend.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "inlineMetadataType", types = {Person.class})
public interface PersonProjection {
    String getName();

    List<PersonMetadataProjection> getMetadata();
}

@Projection(name = "inlineMetadataType", types = {PersonMetadata.class})
interface PersonMetadataProjection {
    @Value("#{target.type.name}")
    String getType();

    String getValue();
}
