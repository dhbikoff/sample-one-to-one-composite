package sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.models.Baz;
import sample.models.Pk;

public interface BazRepository extends JpaRepository<Baz, Pk> {
    Baz findByPk(Pk pk);

    default Baz findByNameAndAddress(String name, String address) {
        return findByPk(new Pk(name, address));
    }
}
