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

    private Utility utility = PowerMockito.spy(new Utility());

//    @Test
//    public void verifySayHelloStaticMethod() {
//        String name = "Robert Bosch";
//
//        PowerMockito.mockStatic(Utility.class);
//        PowerMockito.when(Utility.sayHello(name)).thenReturn("Hello! Robert Bosch");
//
//        String actualMessage = Utility.sayHello(name);
//        assertEquals("Hello! Robert Bosch", actualMessage);
//    }

    // practically better test, to test some method which is calling static method
    @Test
    public void verifySendHelloMessage() {
        String name = "Robert Bosch";

        PowerMockito.mockStatic(Utility.class);
        PowerMockito.when(Utility.sayHello(name)).thenReturn("Hello! Robert Bosch");

        String actualMessage = utility.sendHelloMessage(name);
        assertEquals("Hello! Robert Bosch", actualMessage);
    }

    @Test
    public void verifyGetGreetingMessagePrivateMethod() throws Exception {
        String name = "Robert Bosch";

        PowerMockito.doReturn("Good Morning! Robert Bosch").when(utility, "getMessage", name);

        String actualMessage = utility.getGreetingMessage(name);
        assertEquals("Good Morning! Robert Bosch", actualMessage);
    }

//    @Test
//    public void verifyGetGreetingMessageFinalMethod() throws Exception {
//        String name = "Robert Bosch";
//
//        Utility utility = PowerMockito.mock(Utility.class);
//        PowerMockito.when(utility.getCongratsMessage(name)).thenReturn("Congratulations! Robert Bosch");
//
//        String actualMessage = utility.getCongratsMessage(name);
//        assertEquals("Congratulations! Robert Bosch", actualMessage);
//    }

    @Test
    public void verifySendGreetingsMessage() throws Exception {
        String name = "Robert Bosch";

        PowerMockito.doReturn("Congratulations! Robert Bosch").when(utility, "getCongratsMessage", name);

        String actualMessage = utility.sendCongratsMessage(name);
        assertEquals("Congratulations! Robert Bosch", actualMessage);
    }
}