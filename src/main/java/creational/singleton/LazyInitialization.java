package creational.singleton;

public final class LazyInitialization {
    private static LazyInitialization instance = null;

    private LazyInitialization() {
    }

    public static synchronized LazyInitialization getInstance() {
        if (instance == null)
            instance = new LazyInitialization();
        return instance;
    }
}
