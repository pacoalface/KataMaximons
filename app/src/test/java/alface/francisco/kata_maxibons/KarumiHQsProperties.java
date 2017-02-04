package alface.francisco.kata_maxibons;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;

/**
 * Created by franciscoalfacemartin on 4/2/17.
 */

@RunWith(JUnitQuickcheck.class) public class KarumiHQsProperties {
    KarumiHQs karumiHQs;

    @Mock SystemChat chat;

    @Before public void setup() {
        MockitoAnnotations.initMocks(this);
        karumiHQs = new KarumiHQs(chat);
    }

    @Property public void theNumberOfMaxibonsToGrabIsGreaterThan2(@From(DevelopersGenerator.class) Developer developer)
        throws Exception {
        karumiHQs.openFridge(developer);
        //System.out.println(developer.toString());
        assertTrue(karumiHQs.getMaxibonsLeft() > 2);
    }

    @Property(trials = 20) public void ifThereAreLessThanTwoMaxibonsLeftAMessageIsSentRequestingMore(
        @From(HungryDevelopersGenerator.class) Developer developer) {

        karumiHQs.openFridge(developer);
        verify(chat).sendMessage(String.format("Hi guys, I'm %s. We need more maxibons!", developer.getName()));
    }
}
