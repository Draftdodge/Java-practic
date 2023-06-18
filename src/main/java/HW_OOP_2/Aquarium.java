package HW_OOP_2;

import java.util.*;

public class Aquarium {
    private List<AquaticCreatures> aquarium = new ArrayList<>();

    public Aquarium addAnimal(AquaticCreatures someAquariumCreatures) {
        aquarium.add(someAquariumCreatures);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("В аквариуме:\n");
        for (AquaticCreatures animal : aquarium) {
            builder.append(animal)
                    .append('\n');
        }
        return builder.toString();

    }
}