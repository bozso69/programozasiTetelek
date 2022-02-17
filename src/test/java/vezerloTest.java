import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class vezerloTest {
    vezerlo vez;

    int[] tomb = {1, 2, 4, 5, 43, 6, 8, 10};
    int[] tomb0 = {0,0,0,0,0,0,0,0,0,0,};

    @BeforeEach
    void setUp() {
        vez = new vezerlo();
    }

    @AfterEach
    void tearDown() {
        vez = null;
    }

    @Test
    @DisplayName("Teszt összegzés tétele")

    public void osszegzesTetele() {
        assertEquals(79, vez.osszegzesTetele(tomb));
        assertEquals(0, vez.osszegzesTetele(tomb0));
        assertNotEquals(79+1,vez.osszegzesTetele(tomb));
    }

    @Test
    @DisplayName("Megszámlálés Tetele")
    public void megszamlalasTetele(){
        assertEquals(4, vez.megszamlalasTetele(tomb));
        assertNotEquals(4, vez.megszamlalasTetele(tomb0));
    }
    @Test
    @DisplayName("Eldöntés Tétele")
    public void eldontestetele(){
        assertTrue(vez.eldontestetele(tomb,5));
        assertTrue(vez.eldontestetele(tomb0,0));
        assertFalse(vez.eldontestetele(tomb, 45));
    }
    @Test
    @DisplayName("Kiválasztás Tétele")
    public void kivalasztasTetele(){
        assertEquals(4,vez.kivalasztasTetele(tomb,5));
        assertNotEquals(5,vez.kivalasztasTetele(tomb,5));
        assertEquals(0,vez.kivalasztasTetele(tomb,11));

    }
}
