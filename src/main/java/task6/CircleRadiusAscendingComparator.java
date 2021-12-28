package task6;

import task3.Circle;

import java.util.Comparator;

public class CircleRadiusAscendingComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        return Double.compare(o1.getRadius(), o2.getRadius());
    }
}
