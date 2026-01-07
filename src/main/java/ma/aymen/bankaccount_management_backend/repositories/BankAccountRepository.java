package ma.aymen.bankaccount_management_backend.repositories;

import ma.aymen.bankaccount_management_backend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
