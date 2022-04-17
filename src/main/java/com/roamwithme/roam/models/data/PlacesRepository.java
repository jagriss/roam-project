package com.roamwithme.roam.models.data;

import com.roamwithme.roam.models.Places;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacesRepository extends CrudRepository<Places, Integer>{
}
