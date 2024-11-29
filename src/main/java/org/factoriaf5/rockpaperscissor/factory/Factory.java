package org.factoriaf5.rockpaperscissor.factory;

import org.factoriaf5.rockpaperscissor.models.Lizard;
import org.factoriaf5.rockpaperscissor.models.Paper;
import org.factoriaf5.rockpaperscissor.models.Rock;
import org.factoriaf5.rockpaperscissor.models.Scissor;
import org.factoriaf5.rockpaperscissor.models.Spock;

public class Factory  {
public static Object createChoice(String choice) {
    switch (choice.toLowerCase()) {
        case "rock":
            return new Rock();
        case "paper":
            return new Paper();
        case "scissors":
            return new Scissor();
        case "lizard":
            return new Lizard();
        case "spock":
            return new Spock();
        default:
            throw new IllegalArgumentException("Invalid choice!");
    }
}
}
