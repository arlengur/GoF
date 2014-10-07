package creational.singleton;

/**
 * При помощи использования внутреннего класса Вы получаете ленивый
 * (объект Singleton не инициализируется до моменты вызова метод getInstance())
 * и потоко-безопасный Singleton.
 * Поскольку в классе Singleton нет статических полей которые нужно инициализировать,
 * класс беспрепятственно загрузится. То есть Вам не нужно ждать,
 * пока мы создадим объект Singleton в самом начале,
 * когда загружаются классы.
 * Когда объект INSTANCE будет создан? Тогда, когда мы вызовем метод getInstance(),
 * что повлечет загрузку внутреннего класса SingletonHolder,
 * что спровоцирует создание объекта INSTANCE.
 * Поскольку фаза инициализации класса гарантировано (спецификацией) "не конкурента",
 * то у нас нет необходимости использовать synchronized и volatile.
*/
public class BestSingleton {
    // Private constructor prevents instantiation from other classes
    private BestSingleton() {
    }
    /**
     * SingletonHolder is loaded on the first execution of Singleton.getInstance()
     * or the first access to SingletonHolder.INSTANCE, not before.
     */
    private static class SingletonHolder {
        private static final BestSingleton INSTANCE = new BestSingleton();
    }

    public static BestSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
