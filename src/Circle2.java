class Circle2 implements Shape2 {
    private String color;
    private int x, y, radius;

    public Circle2(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle [Color: " + color + ", x: " + x + ", y: " + y + ", radius: " + radius + "]");
    }
}
