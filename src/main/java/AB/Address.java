package AB;

import java.io.File;
import java.util.Objects;

public class Address {

    private String street;
    private int house;
    private int flat;

    public Address(String street, int house, int flat) {
        if (street.equals("") || street.equals(" ")) throw new NullPointerException("Street cannot be empty");
        if (house < 0) throw new IllegalArgumentException("House number cannot be less than zero");
        if (flat < 0) throw new IllegalArgumentException("Flat number cannot be less than zero");

        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public int getFlat() {
        return flat;
    }

    @Override
    public String toString() {
        return "    ул. " + street + " д. " + house + " кв. " + flat + File.separator;
    }

    @Override
    public boolean equals(Object data) {
        if (data == this) {
            return true;
        }
        if (data == null || data.getClass() != this.getClass()) {
            return false;
        }
        Address dat = (Address) data;
        return street.equals(dat.street) && house == dat.house && flat == dat.flat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, house, flat);
    }
}
