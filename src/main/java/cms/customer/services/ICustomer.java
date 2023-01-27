package cms.customer.services;


import cms.customer.models.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomer {
    List<Customer> getCustomers();

    Optional<Customer> getCustomerByIf(Long id);

    void deleteCustomer(Long id);

    void addCustomer(Customer customer);
}
