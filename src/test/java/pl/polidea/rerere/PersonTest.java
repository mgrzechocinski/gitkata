package pl.polidea.rerere;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import pl.gitkata.rerere.Person;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
}
