package AnimalNursery.model.implement;

import java.time.LocalDate;

import AnimalNursery.model.AbstractAnimal;
import AnimalNursery.model.AnimalGenius;

public class Hamster extends AbstractAnimal {
    public Hamster(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.HAMSTER);
    }
}