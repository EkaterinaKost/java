package AnimalNursery.model.implement;

import java.time.LocalDate;

import AnimalNursery.model.AbstractAnimal;
import AnimalNursery.model.AnimalGenius;

public class Dog extends AbstractAnimal {
    public Dog(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.DOG);
    }
}
