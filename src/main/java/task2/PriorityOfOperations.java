package task2;

import java.util.HashMap;
import java.util.Map;

public class PriorityOfOperations {
    private final Map<String, Integer> priority;

    {
        priority = new HashMap<>();
        priority.put("+", 1);
        priority.put("-", 1);
        priority.put("*", 2);
        priority.put("/", 2);
        priority.put("^", 3);
    }

    public int getPriority(String c) {
        return priority.get(c);
    }
}
