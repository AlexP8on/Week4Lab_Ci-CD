package ie.atu.week4_lab_cicd;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/person")
public class PersonController {

List<Person> personList = new ArrayList<>();

    @GetMapping("/getPerson")
    public List<Person> getPerson()

    {
        return personList;
    }
    @PostMapping("/addPerson")
    public List<Person> addPerson(@RequestBody @Valid Person person)
    {
       personList.add(person);
        return personList;
    }



}
