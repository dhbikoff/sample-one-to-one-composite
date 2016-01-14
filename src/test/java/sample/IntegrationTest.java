package sample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sample.models.Bar;
import sample.models.Baz;
import sample.models.Pk;
import sample.repositories.BarRepository;
import sample.repositories.BazRepository;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class IntegrationTest {

    @Autowired
    private BazRepository bazRepo;

    @Autowired
    private BarRepository barRepo;

    private Bar bar;

    @Before
    public void setUp() throws Exception {
        barRepo.deleteAll();
        bazRepo.deleteAll();

        Pk pk = new Pk("name1", "address1");

        bar = new Bar(pk);
        barRepo.save(bar);
        bar = barRepo.findOne(pk);

        Baz baz = new Baz(pk);
        bazRepo.save(baz);
    }

    @Test
    public void testOne() throws Exception {
        Baz baz = bazRepo.findByNameAndAddress("name1", "address1");

        assertThat(baz.getUid()).isEqualTo(bar.barId);
    }
}
