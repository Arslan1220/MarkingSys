package at.fhtw.markingsys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


class MarkServiceTest {

    @Autowired
    Controller Controller;

    @Autowired
    MarkService MarkService;
    @Test
    void getComplementary() {
        Assertions.assertEquals("1", Controller.getComplementary("96"));
    }

    @Test
    void testGetComplementary() {
        Assertions.assertEquals("3", MarkService.getComplementary("65"));
    }

}