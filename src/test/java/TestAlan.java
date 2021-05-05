import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAlan {

    Alan alan;
    @BeforeEach
    void create(){
        alan=new Alan();
    }

    @Test
    void ciao() {
        assertEquals("CIAO", alan.get());
    }
}
