package ma.aymen.bankaccount_management_backend.repositories;

import ma.aymen.bankaccount_management_backend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
