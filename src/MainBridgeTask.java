public class MainBridgeTask {
    public static void main(String[] args) {
        Renderer windowsRenderer = new WindowsRenderer();
        Renderer linuxRenderer = new LinuxRenderer();

        Shape circle = new Circle(windowsRenderer);
        Shape square = new Square(linuxRenderer);

        circle.draw();  // Рендер Circle на Windows
        square.draw();  // Рендер Square на Linux
    }
}
