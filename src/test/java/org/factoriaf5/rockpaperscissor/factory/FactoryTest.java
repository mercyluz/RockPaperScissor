package org.factoriaf5.rockpaperscissor.factory;

import org.factoriaf5.rockpaperscissor.models.Lizard;
import org.factoriaf5.rockpaperscissor.models.Paper;
import org.factoriaf5.rockpaperscissor.models.Rock;
import org.factoriaf5.rockpaperscissor.models.Scissor;
import org.factoriaf5.rockpaperscissor.models.Spock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

    @Test
    public void testCreateRock() {
        Object choice = Factory.createChoice("rock");
        assertNotNull(choice, "The object should not be null");
        assertTrue(choice instanceof Rock, "The created object should be of type Rock");
    }

    @Test
    public void testCreatePaper() {
        Object choice = Factory.createChoice("paper");
        assertNotNull(choice, "The object should not be null");
        assertTrue(choice instanceof Paper, "The created object should be of type Paper");
    }

    @Test
    public void testCreateScissors() {
        Object choice = Factory.createChoice("scissors");
        assertNotNull(choice, "The object should not be null");
        assertTrue(choice instanceof Scissor, "The created object should be of type Scissors");
    }

    @Test
    public void testCreateLizard() {
        Object choice = Factory.createChoice("lizard");
        assertNotNull(choice, "The object should not be null");
        assertTrue(choice instanceof Lizard, "The created object should be of type Lizard");
    }

    @Test
    public void testCreateSpock() {
        Object choice = Factory.createChoice("spock");
        assertNotNull(choice, "The object should not be null");
        assertTrue(choice instanceof Spock, "The created object should be of type Spock");
    }

    @Test
    public void testCreateInvalidChoice() {
        assertThrows(IllegalArgumentException.class, () -> {
            Factory.createChoice("invalid");
        }, "An IllegalArgumentException should be thrown for an invalid choice");
    }

    @Test
    public void testCreateChoiceCaseInsensitive() {
        Object choice = Factory.createChoice("RoCk");
        assertNotNull(choice, "The object should not be null");
        assertTrue(choice instanceof Rock, "The created object should be of type Rock");

        choice = Factory.createChoice("PAPEr");
        assertNotNull(choice, "The object should not be null");
        assertTrue(choice instanceof Paper, "The created object should be of type Paper");
    }
}

