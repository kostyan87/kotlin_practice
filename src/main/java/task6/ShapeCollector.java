package task6;

import task3.Shape;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeCollector<T extends Shape> {
    private final List<T> allShapes;

    {
        allShapes = new ArrayList<>();
    }

    public void add(T shape) {
        allShapes.add(shape);
    }

    public void addAll(List<T> shapes) {
        allShapes.addAll(shapes);
    }

    public List<T> getAll() {
        return new ArrayList<>(allShapes);
    }

    public List<T> getAllSorted(Comparator<? super T> comparator) {
        return allShapes.stream().sorted(comparator).collect(Collectors.toList());
    }
}
