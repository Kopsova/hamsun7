import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

    Extension extension = new Extension();

    @Test
    void testAdd_2and3is5() {

        assertEquals(5, extension.add(2, 3));
    }

    @Test
    void testAdd_1and4is5() {

        assertEquals(5, extension.add(1, 4));
    }

    @Test
    void testMaxOfThree_first() {
        assertEquals(5, extension.maxOfThree(5, 4, 3));
    }

    @Test
    void testMaxOfThree_third() {
        assertEquals(9, extension.maxOfThree(7, 5, 9));
    }

    @Test
    void testMedian_four() {
        assertEquals(4, extension.median(Arrays.asList(1, 4, 4, 8)));
    }

    @Test
    void testMedian_five() {
        assertEquals(3, extension.median(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    void testIsVowel_a() {
        assertTrue(extension.isVowel('ě'));
    }

    @Test
    void testIsVowel_u() {
        assertTrue(extension.isVowel('u'));
    }

    @Test
    void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }

    @Test
    void testTranslate_lagopus() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }
}