import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class vezerloTest {
    vezerlo vez;

    int[] tomb = {1, 2, 4, 5, 43, 6, 8, 10};
    int[] tombvisszaNagyobb = {43, 6, 8, 10,0,0,0,0};

    int[] tomb0 = {0,0,0,0,0,0,0,0,0,0,};
    int[] tombMinus = {-5,-2,-9,10,18,1,-12,12,-18,-14,};

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
        assertNotEquals(-39,vez.osszegzesTetele(tombMinus));
        assertEquals(-19,vez.osszegzesTetele(tombMinus));
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
    @Test
    @DisplayName("Keresés Tétele")
    public void keresesTetele(){
        assertTrue(vez.keresesTetele(tomb,5));
        assertFalse(vez.keresesTetele(tomb,0));
    }
    @Test
    @DisplayName("Kiválogatás Tétele")
    public void kivalogatasTetele(){
        assertArrayEquals(new int[]{43, 6, 8, 10,0,0,0,0}, vez.kivalogatasTetele(tomb,5));

    }
}
