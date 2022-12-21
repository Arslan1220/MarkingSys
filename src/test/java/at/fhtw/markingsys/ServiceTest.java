package at.fhtw.markingsys;

import at.fhtw.markingsys.Service;
import at.fhtw.markingsys.Controller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;




class ServiceTest {

    @Autowired
    Controller Controller;

    @Autowired
    Service Service;
    @Test
    void getComplementary() {
        Assertions.assertEquals("1", Controller.getComplementary("96"));
    }

    @Test
    void testGetComplementary() {
        Assertions.assertEquals("3", Service.getComplementary("65"));
    }
}