package AB;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    //correct values
    private String secondName1 = new String("Ice");
    private String secondName2 = new String("Lava");

    private Address address1 = new Address("Pushka", 11, 99);
    private Address address2 = new Address("Street", 1, 9);
    private Address address3 = new Address("NewStreet", 10, 55);

    @Test
    void add() {
        AddressBook actualInfo = new AddressBook();
        actualInfo.add(secondName1, address1);
        actualInfo.add(secondName2, address2);
        AddressBook expectedInfo = new AddressBook();
        expectedInfo.getAddressBook().put(secondName1, address1);
        expectedInfo.getAddressBook().put(secondName2, address2);
        assertEquals(expectedInfo, actualInfo);
        System.out.println(actualInfo.toString());
    }

    @Test
    void dell() {
        AddressBook actualInfo = new AddressBook();
        actualInfo.add(secondName1, address1);
        actualInfo.add(secondName2, address2);
        actualInfo.dell(secondName2);
        AddressBook expectedInfo = new AddressBook();
        expectedInfo.getAddressBook().put(secondName1, address1);
        assertEquals(expectedInfo, actualInfo);
        System.out.println(actualInfo.toString());
    }

    @Test
    void changeAddress() {
        AddressBook actualInfo = new AddressBook();
        actualInfo.add(secondName1, address1);
        actualInfo.add(secondName2, address2);
        actualInfo.changeAddress(secondName1, address3);
        AddressBook expectedInfo = new AddressBook();
        expectedInfo.getAddressBook().put(secondName1, address3);
        expectedInfo.getAddressBook().put(secondName2, address2);
        assertEquals(expectedInfo, actualInfo);
        System.out.println(actualInfo.toString());
    }

    @Test
    void findAddress() {
        AddressBook actualInfo = new AddressBook();
        actualInfo.add(secondName1, address1);
        actualInfo.add(secondName2, address2);
        AddressBook expectedInfo = new AddressBook();
        expectedInfo.getAddressBook().put(secondName1, address1);
        expectedInfo.getAddressBook().put(secondName2, address2);
        assertEquals(expectedInfo.getAddressBook().get(secondName1), actualInfo.findAddress(secondName1));
        System.out.println(actualInfo.findAddress(secondName1).toString());
    }

    
}