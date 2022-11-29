package com.java.CustomerProfileService.resources;

        import com.java.CustomerProfileService.dao.CustomerRepo;
        import com.java.CustomerProfileService.models.CustomerProfile;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import java.util.ArrayList;
        import java.util.List;



@Service
public class ServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo repo;
    List <CustomerProfile> customermodelList = new ArrayList < > ();

//    @Override
//    public void addCustomermodel(CustomerProfile profile) {
//        repo.save(profile);
//    }

    @Override
    public void addCustomerProfile(CustomerProfile profile) {repo.save(profile);

    }

    @Override
    public List <CustomerProfile> getCustomerprofiles() {
        return repo.findAll();
    }
}