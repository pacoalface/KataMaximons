package alface.francisco.kata_maxibons;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitQuickcheck.class) public class DevelopersProperties {

    KarumiHQs karumiHQs;

    @Mock SystemChat chat;

    @Before public void setup() {
        MockitoAnnotations.initMocks(this);
        karumiHQs = new KarumiHQs(chat);
    }

    @Property(trials = 50) public void theNumberOfMaxibonsAssignedIsPositiveOrZero(int maxibons) {
        Developer developer = new Developer("Paco", maxibons);
        System.out.println(developer.toString());
        assertTrue(developer.getNumberOfMaxibons() >= 0);
    }

    @Property public void theNameOfDeveloperIsTheSame(int maxibons, String name) {
        Developer developer = new Developer(name, maxibons);
        System.out.println(developer.toString());
        assertEquals(name, developer.getName());
    }

    @Property public void theNameOfDeveloperIsTheSame(@From(DevelopersGenerator.class) Developer developer)
        throws Exception {
        System.out.println(developer.toString());
        assertTrue(developer.getNumberOfMaxibons() >= 0);
    }
}