package Address;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<BuddyInfo> addressbook;

    public AddressBook() {
        addressbook = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddyInfo) {
        addressbook.add(buddyInfo);
    }

    public List<BuddyInfo> getAddressbook() {
        return this.addressbook;
    }

    public void removeBuddy(BuddyInfo buddyInfo) {
        addressbook.remove(buddyInfo);
    }

}