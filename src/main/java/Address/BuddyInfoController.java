package Address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BuddyInfoController {
    @Autowired
    private BuddyInfoRepository repository;


    @GetMapping("/buddy/{id}")
    public Optional<BuddyInfo> GetBuddy(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping("/buddy")
    public BuddyInfo PostBuddy(@RequestBody BuddyInfo buddyInfo) {
        return repository.save(buddyInfo);
    }
}

