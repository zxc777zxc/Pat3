class Circle extends Shape {
    Circle(Renderer renderer) {
        super(renderer);
    }

    @Override
    void draw() {
        renderer.renderShape("Circle");
    }
}
