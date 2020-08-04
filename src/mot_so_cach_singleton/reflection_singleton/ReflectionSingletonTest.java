package mot_so_cach_singleton.reflection_singleton;

import mot_so_cach_singleton.eager_initialization.EagerInitializedSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
       // EagerInitializedSingleton instanceTwo = null;
        EagerInitializedSingleton instanceTwo = EagerInitializedSingleton.getInstance();
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println((instanceOne.hashCode()));
        System.out.println((instanceTwo.hashCode()));
    }
}
