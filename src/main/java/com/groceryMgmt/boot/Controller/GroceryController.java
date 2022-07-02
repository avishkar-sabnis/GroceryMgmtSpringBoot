package com.groceryMgmt.boot.Controller;

import com.groceryMgmt.boot.DAO.GroceryDAO;
import com.groceryMgmt.boot.Model.GroceryModel;
import com.groceryMgmt.boot.Service.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Grocery")
public class GroceryController {
    @Autowired
    GroceryService groceryService;


    @Autowired
    GroceryDAO groceryDAO;

    @PostMapping("/create")
    public GroceryModel CreateCustomer(@RequestBody GroceryModel groceryModel){
        return groceryService.createCust(groceryModel);

    }

    @GetMapping("/allCust")
    public Iterable<GroceryModel> findAllCustomer(GroceryModel groceryModel){
        return (groceryDAO.findAll());

    }

   /* @GetMapping("{/price}")
    public Iterable<GroceryModel> findSingleCustomer(@PathVariable int price){
        return groceryService.findSingleCust(price);

    }*/


}
