package com.qa.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackjackTest {

    @Test
    void testP1Bust() {
        Assertions.assertEquals(19, Blackjack.play(22, 19));
    }

    @Test
    void testP2Bust() {
        Assertions.assertEquals(17, Blackjack.play(17, 24));
    }

    @Test
    void testBothBust() {
        Assertions.assertEquals(0, Blackjack.play(25, 22));
    }

    @Test
    void testP1Win() {
        Assertions.assertEquals(17, Blackjack.play(17, 15));
    }

    @Test
    void testP2Win() {
        Assertions.assertEquals(17, Blackjack.play(15, 17));
    }

    @Test
    void testDraw() {
        Assertions.assertEquals(20, Blackjack.play(20, 20));
    }


}
