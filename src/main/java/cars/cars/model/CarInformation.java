package cars.cars.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CarInformation {
    private final String name;
    private final String owner;
    private final Type type;

    public static enum Type {
        COUPE,
        BUGGY,
        CABRIOLET,
        ROADSTER,
        SEDAN,
        HATCHBACK
    }
}
