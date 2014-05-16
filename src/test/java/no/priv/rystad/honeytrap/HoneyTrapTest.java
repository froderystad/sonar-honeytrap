package no.priv.rystad.honeytrap;

import org.junit.Assert;
import org.junit.Test;

public class HoneyTrapTest {

    @Test
    public void sayHello() {
        Assert.assertEquals("Hello", new HoneyTrap().sayHello(true));
    }

}