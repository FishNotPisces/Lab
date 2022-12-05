package Figure.Cerchio;

public class Cerchio {

    public Cerchio(double center_x, double center_y, double radius) {
        this.center = new Center();
        this.center.x = center_x;
        this.center.y = center_y;
        this.radius = radius;
    }

    public boolean isCoincident(Cerchio c) {
        return this.radius == c.radius
            && this.center.x == c.center.x
            && this.center.x == c.center.x;
    }

    public boolean isEncircled(Cerchio c) {
        return Center.distance(this.center, c.center) < Math.max(c.radius, this.radius)
            && Math.abs(c.radius - this.radius) >= Center.distance(this.center, c.center);
    }

    public boolean isExternal(Cerchio c) {
        return (this.radius + c.radius) < Center.distance(this.center, c.center);
    }

    public boolean isSecant(Cerchio c) {
        return (this.radius + c.radius) > Center.distance(this.center, c.center)
            && Math.abs(c.radius - this.radius) < Center.distance(this.center, c.center); 
    }

    public boolean isTangential(Cerchio c) {
        return !Center.coincides(this.center, c.center) && (
                (this.radius + c.radius) == Center.distance(this.center, c.center)
                || (this.radius - c.radius) == Center.distance(this.center, c.center)
            );
    }

    private double radius;
    private Center center;

    private class Center {
        public double x;
        public double y;

        public static double distance(Center p, Center q) {
            return Math.sqrt(Math.pow((q.x - p.x), 2) + Math.pow((q.y - p.y), 2));
        }

        public static boolean coincides(Center p, Center q) {
            return q.x == p.x && q.y == p.y;
        }

    }
}
