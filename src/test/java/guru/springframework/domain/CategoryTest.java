package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CategoryTest {

    Category category;

    @Before
    public void setup() {
        category = new Category();
    }


    @Test
    public void testGetId() {
        Long idValue = 12L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void testGetDescription() {

    }

    @Test
    public void testGetRecipes() {

    }
}