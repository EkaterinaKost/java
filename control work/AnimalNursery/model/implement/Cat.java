package AnimalNursery.model.implement;

import java.time.LocalDate;

import AnimalNursery.model.AbstractAnimal;
import AnimalNursery.model.AnimalGenius;

public class Cat extends AbstractAnimal {
    public Cat(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.CAT);
    }
}
