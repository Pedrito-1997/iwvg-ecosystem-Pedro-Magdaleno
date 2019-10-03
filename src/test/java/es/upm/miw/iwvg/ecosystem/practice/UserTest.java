package es.upm.miw.iwvg.ecosystem.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user;

    @BeforeEach
    public void before() {
        user = new User(1, "Pedro", "Magdaleno");
    }

    @Test
    public void testUserGets() {
        assertEquals(1, user.getNumber());
        assertEquals("Pedro", user.getName());
        assertEquals("Magdaleno", user.getFamilyName());
    }

    @Test
    public void testUserFullName() {
        assertEquals("Pedro Magdaleno", user.fullName());
    }

    @Test
    public void testUserInitials() {
        assertEquals("P.", user.initials());
    }


}

