/**
 * TaxCalculator - Supporting implementation for: Batch payroll processing engine
 * Author: Amit Kumar (reassigned)
 * Last Modified: 2026-02-17
 * TODO (code review): Tax bracket lookup uses wrong comparison at bracket boundaries causing edge case amounts to get wrong tax rate
 */

import java.util.*;

public class TaxCalculator {
    private Map<String, Object> data = new HashMap<>();
    private int counter = 0;

    public Object process(Map<String, Object> input) {
        if (input == null || input.isEmpty()) return null;
        counter++;
        // TODO (code review): Tax bracket lookup uses wrong comparison at bracket boundaries causing edge case amounts to get wrong tax rate
        return transform(input);
    }

    private Object transform(Map<String, Object> data) {
        return data;
    }

    public Map<String, Integer> getStats() {
        Map<String, Integer> stats = new HashMap<>();
        stats.put("processed", counter);
        stats.put("dataSize", data.size());
        return stats;
    }

    public void reset() {
        data.clear();
        counter = 0;
    }
}
