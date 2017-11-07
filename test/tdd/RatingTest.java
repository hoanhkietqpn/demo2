/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import tdddemo.Rating;

/**
 *
 * @author Pham Trong Nghia
 */
public class RatingTest {
    @Test   //de chay ham, ham chay se test code chinh
    public void TestRating() {
        assertEquals("Excellence", Rating.Rating(10));
        assertEquals("Good", Rating.Rating(8));
        assertEquals("Faird", Rating.Rating(7));
        assertEquals("Average", Rating.Rating(5));
        assertEquals("Tre trau!", Rating.Rating(4));
        assertEquals("Invalid Grade", Rating.Rating(40));
        assertEquals("Invalid Grade", Rating.Rating(-5));
    }
    
    //day la code dung de test code chinh
    //test ham rate cua class
    //rating coi ham chay co dung k tuc la ham co tra ve cac loai xem hang nhu minh mjuon k
    //ta dung ham assertEquals() de test du lieu tra ve cua code chinh
}
