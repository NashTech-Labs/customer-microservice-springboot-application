package com.java.CustomerProfileService.controller;
import com.java.CustomerProfileService.models.CustomerProfile;
import com.java.CustomerProfileService.resources.CustomerService;
import com.java.CustomerProfileService.resources.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * The type Customer catalog resource.
 */
@RestController
@RequestMapping("/customer")
public class CustomerCatalogResource {
    /**
     * The Customerservice.
     */
    @Autowired
    ServiceImpl customerservice;

    /**
     * Save customer profile.
     *
     * @param profile the profile
     */
// enabling angular local host to fetch data
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public void saveCustomerProfile(@RequestBody CustomerProfile profile) {
        customerservice.addCustomerProfile(profile);
    }

    /**
     * Gets all customers.
     *
     * @return the all customers
     */
// enabling angular local host to fetch data
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List <CustomerProfile> getAllCustomers() {
        return customerservice.getCustomerprofiles();
    }

}

   /* @RequestMapping("/{userId}")
    public List<Customermodel> getCatalog(@PathVariable("userId") String userId) {
        return Collections.singletonList(
                new Customermodel( "priya", "female", 18, "delhi")
        );


    }
}*/
