package com.java.CustomerProfileService.resources;

import com.java.CustomerProfileService.models.CustomerProfile;

import java.util.List;

public interface CustomerService {
     void addCustomerProfile(CustomerProfile profile);
    List<CustomerProfile> getCustomerprofiles();
}
