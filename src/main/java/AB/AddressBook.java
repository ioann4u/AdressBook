package AB;

import java.util.*;

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

    public Set listSecondNamesByStreet(String street) {
        HashSet<String> secondNames = new HashSet<>();
        for (Map.Entry<String, Address> entry : addressBook.entrySet()) {
            if (entry.getValue().getStreet().equals(street))
                secondNames.add(entry.getKey());
        }
        return secondNames;
    }

    public Set listSecondNamesByStreetAndHouse(String street, int house) {
        HashSet<String> secondNames = new HashSet<>();
        for (Map.Entry<String, Address> entry : addressBook.entrySet()) {
            if (entry.getValue().getStreet().equals(street) && entry.getValue().getHouse() == house)
                secondNames.add(entry.getKey());
        }
        return secondNames;
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


