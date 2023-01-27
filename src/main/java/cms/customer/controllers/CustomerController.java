package cms.customer.controllers;

import cms.customer.models.Customer;
import cms.customer.services.CustomerService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.DefaultEditorKit;
import java.util.List;

@NoArgsConstructor
@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    private String index() {

        return "index";
    }

    @RequestMapping("/customers")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @PostMapping("/add")
    public void addCustomers(@RequestBody Customer customer){

         customerService.addCustomer(customer);
    }
}
