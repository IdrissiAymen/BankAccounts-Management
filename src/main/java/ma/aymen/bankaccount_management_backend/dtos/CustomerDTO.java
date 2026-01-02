package ma.aymen.bankaccount_management_backend.dtos;

import lombok.*;
import ma.aymen.bankaccount_management_backend.entities.Customer;

@Data

public class CustomerDTO extends Customer {
    private Long id;
    private String name;
    private String email;
}
