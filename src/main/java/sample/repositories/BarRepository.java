package sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.models.Bar;
import sample.models.Pk;

public interface BarRepository extends JpaRepository<Bar, Pk> {
}
