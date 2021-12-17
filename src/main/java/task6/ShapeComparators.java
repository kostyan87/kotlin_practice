package task6;

public class ShapeComparators {
    private final AreaAscendingComparator areaAscendingComparator;
    private final AreaDescendingComparator areaDescendingComparator;
    private final PeriemeterAscendingComparator periemeterAscendingComparator;
    private final PeriemeterDescendingComparator periemeterDescendingComparator;
    private final CircleRadiusAscendingComparator circleRadiusAscendingComparator;
    private final CircleRadiusDescendingComparator circleRadiusDescendingComparator;

    {
        areaAscendingComparator = new AreaAscendingComparator();
        areaDescendingComparator = new AreaDescendingComparator();
        periemeterAscendingComparator = new PeriemeterAscendingComparator();
        periemeterDescendingComparator = new PeriemeterDescendingComparator();
        circleRadiusAscendingComparator = new CircleRadiusAscendingComparator();
        circleRadiusDescendingComparator = new CircleRadiusDescendingComparator();
    }

    public AreaAscendingComparator getAreaAscendingComparator() {
        return areaAscendingComparator;
    }

    public AreaDescendingComparator getAreaDescendingComparator() {
        return areaDescendingComparator;
    }

    public PeriemeterAscendingComparator getPeriemeterAscendingComparator() {
        return periemeterAscendingComparator;
    }

    public PeriemeterDescendingComparator getPeriemeterDescendingComparator() {
        return periemeterDescendingComparator;
    }

    public CircleRadiusAscendingComparator getCircleRadiusAscendingComparator() {
        return circleRadiusAscendingComparator;
    }

    public CircleRadiusDescendingComparator getCircleRadiusDescendingComparator() {
        return circleRadiusDescendingComparator;
    }
}
