package AnimalNursery.model.implement;

import java.time.LocalDate;

import AnimalNursery.model.AbstractPackAnimal;
import AnimalNursery.model.AnimalGenius;

public class Donkey extends AbstractPackAnimal {
    public Donkey(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.DONKEY);
    }
}
