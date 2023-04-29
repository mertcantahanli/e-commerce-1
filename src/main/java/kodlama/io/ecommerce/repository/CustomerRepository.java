package kodlama.io.ecommerce.repository;

import kodlama.io.ecommerce.entities.persons.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
