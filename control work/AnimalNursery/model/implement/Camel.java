package AnimalNursery.model.implement;

import java.time.LocalDate;

import AnimalNursery.model.AbstractPackAnimal;
import AnimalNursery.model.AnimalGenius;

public class Camel extends AbstractPackAnimal {
    public Camel(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.CAMEL);
    }
}
