package com.springboot.petmanagement.pet;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @GetMapping("/pet/all")
    public List<Pet> getPets() {
        return petRepository.findAll();
    }

    @PostMapping("/pet/add")
    public Pet createPet(@Valid @RequestBody Pet pet, BindingResult result ) {
        if (result.hasErrors()) {
            // If validation errors exist, return a Bad Request response with the error messages
            List<String> errorMessages = result.getAllErrors().stream()
                    .map(ObjectError::getDefaultMessage)
                    .collect(Collectors.toList());

            throw new IllegalArgumentException("Validation failed: " + String.join(", ", errorMessages));
        }

        return petRepository.save(pet);
    }

    @PutMapping("/pet/update/{id}")
    public Pet updatePet(@PathVariable int id, @RequestBody Pet pet) {
        pet.setId(id);
        return petRepository.save(pet);
    }
    @DeleteMapping("/pet/delete/{id}")
    public void deletePet(@PathVariable int id) {
        petRepository.deleteById(id);
    }

}
