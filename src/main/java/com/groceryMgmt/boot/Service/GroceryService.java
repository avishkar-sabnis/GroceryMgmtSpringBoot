package com.groceryMgmt.boot.Service;

import com.groceryMgmt.boot.DAO.GroceryDAO;
import com.groceryMgmt.boot.Model.GroceryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class GroceryService {


    @Autowired
    GroceryDAO groceryDAO;

    public GroceryModel createCust(GroceryModel groceryModel){
        return groceryDAO.save(groceryModel);
    }



   /* public Iterable<GroceryModel> findSingleCust(int price){
        return groceryDAO.findAllById(price);
    }*/
}
