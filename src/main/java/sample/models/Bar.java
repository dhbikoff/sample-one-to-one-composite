package sample.models;

import javax.persistence.*;

@Entity
@Table(name = "bar")
public class Bar {

    @Column(name = "bar_id")
    @GeneratedValue
    public Integer barId;

    @Id
    public Pk pk;

    @OneToOne
    @PrimaryKeyJoinColumn(foreignKey = @ForeignKey(name = "none"))
    public Baz baz;

    public Bar() {}

    public Bar(Pk pk) {
        this.pk = pk;
    }

    public String getName() {
        return pk.name;
    }

    public String getAddress() {
        return pk.address;
    }
}