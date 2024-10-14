public class Main {
    public static void main(String[] args) {
        // Adapter
        System.out.println("=== Adapter Pattern ===");
        MainAdapterTask.main(args);

        // Bridge
        System.out.println("=== Bridge Pattern ===");
        MainBridgeTask.main(args);

        // Composite
        System.out.println("=== Composite Pattern ===");
        MainCompositeTask.main(args);

        // Decorator
        System.out.println("=== Decorator Pattern ===");
        MainDecoratorTask.main(args);

        // Facade
        System.out.println("=== Facade Pattern ===");
        MainFacadeTask.main(args);

        // Flyweight
        System.out.println("=== Flyweight Pattern ===");
        MainFlyweightTask.main(args);

        // Proxy
        System.out.println("=== Proxy Pattern ===");
        MainProxyTask.main(args);
    }
}
