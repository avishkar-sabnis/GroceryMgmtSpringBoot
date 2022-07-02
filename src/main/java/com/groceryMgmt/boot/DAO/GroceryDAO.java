package com.groceryMgmt.boot.DAO;

import com.groceryMgmt.boot.Model.GroceryModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroceryDAO extends CrudRepository<GroceryModel,Integer> {
    //Optional<GroceryModel> findAllById(int price);
}
