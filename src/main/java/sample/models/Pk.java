package sample.models;


import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Pk implements Serializable {
    public String name;
    public String address;

    public Pk() {}

    public Pk(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Pk{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
