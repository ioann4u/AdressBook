package AB;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AddressBook {
    private HashMap<String, Address> addressBook = new HashMap<String, Address>();

    public boolean add(String secondName, Address address) {
        if (addressBook.containsKey(secondName))
            return false;
            addressBook.put(secondName, address);
        return true;
    }

    public boolean dell(String secondName) {
        if (!addressBook.containsKey(secondName))
             return false;
        addressBook.remove(secondName);
        return true;
    }

    public boolean changeAddress(String secondName, Address newAddress) {
        if (!addressBook.containsKey(secondName))
            return false;
        addressBook.replace(secondName, newAddress);
        return true;
    }

    public Address findAddress(String secondName) {
        return addressBook.get(secondName);
    }

    HashMap<String, Address> getAddressBook() {
        return addressBook;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, Address> res : addressBook.entrySet()) {
            result.append(res.getKey()).append(res.getValue());
        }

        return result.toString();
    }

    @Override
    public boolean equals(Object full) {
        if (full == this) {
            return true;
        }
        if (full == null || full.getClass() != this.getClass()) {
            return false;
        }
        AddressBook another = (AddressBook) full;
        return Objects.equals(addressBook, another.addressBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressBook);
    }
}


