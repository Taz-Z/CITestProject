package Address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddressBookController {

    @Autowired
    private AddressBookRepository repository;
    @Autowired
    private BuddyInfoRepository buddyReposity;


    @RequestMapping("/address")
    public Iterable<AddressBook> GetAddressHooks() {
        return repository.findAll();
    }

    @GetMapping("/address/{id}")
    public Optional<AddressBook> GetAddressBook(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping("/address")
    public AddressBook CreateAddressBook(@RequestBody AddressBook addressBook) {
        return repository.save(addressBook);
    }

    @PutMapping("address/{address_id}/buddy/{buddy_id}")
    public void AddBuddy(@PathVariable Long address_id, @PathVariable Long buddy_id) {
        repository.findById(address_id).get().addBuddy(buddyReposity.findById(buddy_id).get());
    }

}

