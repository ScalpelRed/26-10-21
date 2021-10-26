public class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void SetX(double x) {
        this.x = x;
    }
    
    public void SetY(double y) {
        this.y = y;
    }
    
    public double GetX(){
        return x;
    }
    
    public double GetY() {
        return y;
    }
    
    public void Translate(double x, double y){
        this.x += x;
        this.y += y;
    }
    
    public void TranslateTo(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Point Middle(Point with) {
        return new Point((this.x + with.x) / 2, (this.y + with.y) / 2);
    }
    
    public double DistanceX(Point with){
        return Math.abs(this.x - with.x);
    }
    
    public double DistanceY(Point with){
        return Math.abs(this.y - with.y);
    }
    
    public double Distance(Point with){
        double dx = DistanceX(with);
        double dy = DistanceY(with);
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}