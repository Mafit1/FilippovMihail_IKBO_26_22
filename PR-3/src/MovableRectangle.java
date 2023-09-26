public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
    public void setSpeedTopLeft(int xSpeed, int ySpeed) {
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
    }
    public void setSpeedBottomRight(int xSpeed, int ySpeed) {
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }
    private boolean isSameSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }
    public void moveUp() {
        if (isSameSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else {
            System.out.println("Error");
        }
    }
    public void moveDown() {
        if (isSameSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else {
            System.out.println("Error");
        }
    }
    public void moveLeft() {
        if (isSameSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else {
            System.out.println("Error");
        }
    }
    public void moveRight() {
        if (isSameSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
        else {
            System.out.println("Error");
        }
    }
}
