package mot_so_cach_singleton.eager_initialization;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
