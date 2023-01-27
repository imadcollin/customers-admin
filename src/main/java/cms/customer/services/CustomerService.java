package cms.customer.services;

import cms.customer.models.Customer;
import cms.customer.repos.CustomerRepo;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@NoArgsConstructor
@Service
public class CustomerService implements ICustomer {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public Optional<Customer> getCustomerByIf(Long id) {
        Customer customer = customerRepo.getReferenceById(id);
        return Optional.of(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepo.deleteById(id);
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepo.save(customer);
    }
}
