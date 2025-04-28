public class Engine {
    public void start() {
        System.out.println("Engine started.");
    }

    public void start(boolean silentMode) {
        System.out.println(silentMode ? "Started in silent mode." : "Starting vehicle.");
    }
}
