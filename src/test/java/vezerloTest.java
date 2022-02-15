import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class vezerloTest {
    vezerlo vez;

    int[] tomb = {1, 2, 4, 5, 43, 6, 8, 10};

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
    void osszegzesTetele() {
        assertEquals(79,vez.osszegzesTetele(tomb));
    }
}