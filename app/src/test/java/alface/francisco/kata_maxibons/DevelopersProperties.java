package alface.francisco.kata_maxibons;

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

    @Property(trials = 50) public void theNumberOfMaxibonsAssignedIsPositiveOrZero(int maxibons) throws Exception {
        Developer developer = new Developer("Paco", maxibons);
        System.out.println(developer.toString());
        assertTrue(developer.getNumberOfMaxibons() >= 0);
    }

    @Property public void theNameOfDeveloperIsTheSame(int maxibons, String name) throws Exception {
        Developer developer = new Developer(name, maxibons);

        assertEquals(name, developer.getName());
    }
}