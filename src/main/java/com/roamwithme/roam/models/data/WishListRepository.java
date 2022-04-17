package com.roamwithme.roam.models.data;

import com.roamwithme.roam.models.WishList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepository extends CrudRepository<WishList, Integer> {
}
