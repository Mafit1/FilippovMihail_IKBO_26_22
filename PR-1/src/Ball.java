public class Ball {
    private String color;
    private double radius;
    public Ball(String clr, int rds) {
        color = clr;
        radius = rds;
    }
    public Ball(String clr) {
        color = clr;
        radius = 1;
    }
    public Ball(int rds) {
        color = "white";
        radius = rds;
    }
    public void setColor(String color) {
        this.color= color;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public double getRadius() {
        return radius;
    }
    public String toString() {
        return this.color+", radius "+this.radius;
    }
    public void compress() {
        System.out.println(color+" ball was compressed by "+radius/2+"cm");
    }
    public void eat() {
        radius = 0;
        System.out.println(color+" ball was eaten :(");
    }
}
