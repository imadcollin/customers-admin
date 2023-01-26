package cms.customer.services;


import cms.customer.models.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomer {
    List<Customer> getCustomers();

    Optional<Customer> getCustomerByIf(int id);

    void deleteCustomer(int id);

    void addCustomer(int id);
}
