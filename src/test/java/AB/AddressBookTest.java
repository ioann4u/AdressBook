package AB;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    //correct values
    private String secondName1 = new String("Ice");
    private String secondName2 = new String("Lava");
    private String secondName3 = new String("Fire");


    private Address address1 = new Address("Pushka", 11, 99);
    private Address address2 = new Address("Street", 1, 9);
    private Address address3 = new Address("NewStreet", 10, 55);



    @Test
    void add() {
        AddressBook actualInfo = new AddressBook();
        actualInfo.add(secondName1, address1);
        actualInfo.add(secondName2, address2);
        AddressBook expectedInfo = new AddressBook();
        expectedInfo.add(secondName1, address1);
        expectedInfo.add(secondName2, address2);
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
        expectedInfo.add(secondName1, address1);
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
        expectedInfo.add(secondName1, address3);
        expectedInfo.add(secondName2, address2);
        assertEquals(expectedInfo, actualInfo);
        System.out.println(actualInfo.toString());
    }

    @Test
    void findAddress() {
        AddressBook actualInfo = new AddressBook();
        actualInfo.add(secondName1, address1);
        actualInfo.add(secondName2, address2);
        AddressBook expectedInfo = new AddressBook();
        expectedInfo.add(secondName1, address1);
        expectedInfo.add(secondName2, address2);
        assertEquals(address1, actualInfo.findAddress(secondName1));
        System.out.println(actualInfo.findAddress(secondName1).toString());
    }

    @Test
    void listSecondNamesByStreet() {
        AddressBook actualInfo = new AddressBook();
        actualInfo.add(secondName1, address1);
        actualInfo.add(secondName2, address1);
        actualInfo.add(secondName3, address1);
        HashSet<String> actualSecondNames = new HashSet<>();
        actualSecondNames.add("Ice");
        actualSecondNames.add("Lava");
        actualSecondNames.add("Fire");
        assertEquals(actualSecondNames, actualInfo.listSecondNamesByStreet("Pushka"));
        System.out.println(actualInfo.listSecondNamesByStreet("Pushka"));
    }

    @Test
    void listSecondNamesByStreetAndHouse() {
        AddressBook actualInfo = new AddressBook();
        actualInfo.add(secondName1, address1);
        actualInfo.add(secondName2, address1);
        actualInfo.add(secondName3, address1);
        HashSet<String> actualSecondNames = new HashSet<>();
        actualSecondNames.add("Ice");
        actualSecondNames.add("Lava");
        actualSecondNames.add("Fire");
        assertEquals(actualSecondNames, actualInfo.listSecondNamesByStreetAndHouse("Pushka", 11));
        System.out.println(actualInfo.listSecondNamesByStreet("Pushka"));
    }
}