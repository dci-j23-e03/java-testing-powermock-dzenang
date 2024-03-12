package com.dci.powermock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Utility.class)
public class UtilityTest {

    @Test
    public void verifySayHelloStaticMethod() {
        String name = "Robert Bosch";

        Assert.fail("Missing Mocking");

        String actualMessage = Utility.sayHello(name);
        assertEquals("Hello! Robert Bosch", actualMessage);
    }

    @Test
        public void verifyGetGreetingMessagePrivateMethod() throws Exception {
        String name = "Robert Bosch";

        Utility mock = null;
        Assert.fail("Missing Mocking");

        String actualMessage = mock.getGreetingMessage(name);
        assertEquals("Good Morning! Robert Bosch", actualMessage);
    }

    @Test
        public void verifyGetGreetingMessageFinalMethod() throws Exception {
        String name = "Robert Bosch";

        Utility utility = null;
        Assert.fail("Missing Mocking");


        String actualMessage = utility.getCongratsMessage(name);
        assertEquals("Congratulations! Robert Bosch", actualMessage);
    }
}