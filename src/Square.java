class Square extends Shape {
    Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    void draw() {
        renderer.renderShape("Square");
    }
}
