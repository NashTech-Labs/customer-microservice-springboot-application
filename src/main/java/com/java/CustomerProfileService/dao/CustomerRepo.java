package com.java.CustomerProfileService.dao;

import com.java.CustomerProfileService.models.CustomerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Customer repo.
 */
@Repository
public interface CustomerRepo extends JpaRepository<CustomerProfile, Long> {

}


