package alface.francisco.kata_maxibons;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

/**
 * Created by franciscoalfacemartin on 4/2/17.
 */

public class NotSoHungryDeveloperGenerator extends Generator<Developer> {

    public NotSoHungryDeveloperGenerator() {
        super(Developer.class);
    }

    @Override public Developer generate(SourceOfRandomness random, GenerationStatus status) {

        int maxibons = random.nextInt(0, 6);
        return new Developer("", maxibons);
    }
}
