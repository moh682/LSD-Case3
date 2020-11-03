package booking.entity;

import junit.framework.TestCase;
import junit.*;
import org.junit.Assert;

import java.util.Date;

public class PersonTest extends TestCase {

    public void testTestGetName() {
        Date date = new Date();
        Person p = new Person("Peter", new Address("niceGprdVej", 2122, "bøllestad"), "nice@nice.dk", date, 1232, false);
        Assert.assertEquals(p.getName(), "Peter");
    }
}