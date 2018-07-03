package ru.adastra.core.listeners;

/**
 * Интерфейс доступа к коллекции слушателей.
 * <br/><br/>Создано: kbakaras, в день: 01.12.2017.
 */
public interface IListeners<L> {
    void addListener(L listener);
    void removeListener(L listener);
}
