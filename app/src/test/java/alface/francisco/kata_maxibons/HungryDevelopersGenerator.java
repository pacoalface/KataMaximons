package alface.francisco.kata_maxibons;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by franciscoalfacemartin on 4/2/17.
 */

public class HungryDevelopersGenerator extends Generator<Developer> {

    public HungryDevelopersGenerator() {
        super(Developer.class);
    }

    @Override public Developer generate(SourceOfRandomness random, GenerationStatus status) {

        String name = RandomStringUtils.random(random.nextInt(16));
        int maxibonsToGrab = random.nextInt(20, Integer.MAX_VALUE);

        return new Developer(name, maxibonsToGrab);
    }
}
