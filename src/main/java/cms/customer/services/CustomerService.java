package cms.customer.services;

import cms.customer.models.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerService implements ICustomer {
    @Override
    public List<Customer> getCustomers() {
        return null;
    }

    @Override
    public Optional<Customer> getCustomerByIf(int id) {
        return Optional.empty();
    }

    @Override
    public void deleteCustomer(int id) {

    }

    @Override
    public void addCustomer(int id) {

    }
}
