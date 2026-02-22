import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class PayrollProcessorTest {
    @Test void shouldProcessValid() {
        PayrollProcessor obj = new PayrollProcessor();
        assertNotNull(obj.process(Map.of("key", "val")));
    }
    @Test void shouldHandleNull() {
        PayrollProcessor obj = new PayrollProcessor();
        assertNull(obj.process(null));
    }
    @Test void shouldTrackStats() {
        PayrollProcessor obj = new PayrollProcessor();
        obj.process(Map.of("x", 1));
        assertEquals(1, obj.getStats().get("processed"));
    }
    @Test void supportShouldWork() {
        TaxCalculator obj = new TaxCalculator();
        assertNotNull(obj.process(Map.of("data", "test")));
    }
}
