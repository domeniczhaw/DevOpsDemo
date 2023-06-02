package ch.zhaw.iwi.devops.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class PersonController {

    private Map<Integer, Person> persons = new HashMap<>();

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        this.persons.put(1,new Person(1, "Joel", "Developer"));
        this.persons.put(2,new Person(2, "Ben", "Junior Developer"));
        this.persons.put(3,new Person(3, "Valentina", "DevOps Champion"));
        this.persons.put(4,new Person(4, "Angelika", "Besucher"));
        System.out.println("Init Data");
    }

    @GetMapping("/test")
    public String test() {
        return "Domenic initiated the app and it is up and running!";
    }

    @GetMapping("/person/ping")
    public String ping() {
        String languageCode = "de";
        return "{ \"status\": \"ok\", \"userId\": \"admin"+ "\", \"languageCode\": \"" + languageCode + "\",\"version\": \"0.0.1" + "\"}";
    }

    @GetMapping("/count")
    public int count() {
        return this.persons.size();
    }

    @GetMapping("/services/person")
    public List<PathListEntry<Integer>> todo() {
        var result = new ArrayList<PathListEntry<Integer>>();
        for (var personal : this.persons.values()) {
            var entry = new PathListEntry<Integer>();
            entry.setKey(personal.getId(), "Joel");
            entry.setName(personal.getTitle());
            entry.getDetails().add(personal.getDescription());
            entry.setTooltip(personal.getDescription());
            result.add(entry);
        }
        return result;
    }

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable Integer id) {
        return this.persons.get(id);
    }

    @PostMapping("/person/{id}")
    public void createPerson(@RequestBody Person person) {
        var newId = this.persons.keySet().stream().max(Comparator.naturalOrder()).orElse(0) + 1;
        person.setId(newId);
        this.persons.put(newId, person);
    }

    @PutMapping("/person/{id}")
    public void updatePerson(@PathVariable Integer id,@RequestBody Person person) {
        person.setId(id);
        this.persons.put(id, person);
    }

    @DeleteMapping("/person/{id}")
    public Person deletePerson(@PathVariable Integer id) {
        return this.persons.remove(id);
    }


}
