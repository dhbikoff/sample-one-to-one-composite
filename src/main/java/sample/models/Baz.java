package sample.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "baz")
public class Baz {
    @Id
    public Pk pk;

    @OneToOne(mappedBy = "baz")
    public Bar bar;

    public Baz() {}

    public Baz(Pk pk) {
        this.pk = pk;
    }

    public String getName() {
        return pk.name;
    }

    public String getAddress() {
        return pk.address;
    }

    public int getUid() {
        return bar.barId;
    }

    @Override
    public String toString() {
        return "Baz{" +
                "pk=" + pk +
                '}';
    }
}
