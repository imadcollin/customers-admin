package cms.customer.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Customer {

    @Id
    private long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String firstName;
    private String lastName;
    private String Email;
}
