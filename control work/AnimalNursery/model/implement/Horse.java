package AnimalNursery.model.implement;

import java.time.LocalDate;

import AnimalNursery.model.AbstractPackAnimal;
import AnimalNursery.model.AnimalGenius;


public class Horse extends AbstractPackAnimal {
    public Horse(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.HORSE);
    }
}
