package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryTest extends TestCase {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void findByDescription() throws Exception {
        String description = "Teaspoon";
        Optional<UnitOfMeasure> optionalUnitOfMeasure = unitOfMeasureRepository.findByDescription(description);
        UnitOfMeasure unitOfMeasure = optionalUnitOfMeasure.orElse(null);
        assert unitOfMeasure != null;
        assertEquals(description, unitOfMeasure.getDescription());
    }

    @Test
    public void findByDescriptionCup() throws Exception {
        String description = "Cup";
        Optional<UnitOfMeasure> optionalUnitOfMeasure = unitOfMeasureRepository.findByDescription(description);
        UnitOfMeasure unitOfMeasure = optionalUnitOfMeasure.orElse(null);
        assert unitOfMeasure != null;
        assertEquals(description, unitOfMeasure.getDescription());
    }
}