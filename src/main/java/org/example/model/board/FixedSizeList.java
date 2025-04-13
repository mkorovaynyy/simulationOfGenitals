package org.example.model.board;

import org.example.exception.FixedSizeListException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;


/**
 * Кастомная реализация List для создания списка строго заданного размера
 */
public class FixedSizeList<E> extends ArrayList<E> {
    // фиксированный размер списка
    private final int fixSize;

    public FixedSizeList(int initialCapacity, int fixSize) {
        super(fixSize);
        this.fixSize = fixSize;
    }


    @Override
    public boolean add(E e) {
        if (this.size() < fixSize) {
            return super.add(e);
        } else throw new FixedSizeListException("Размер списка не может быть изменен и является константным");
    }

    @Override
    public void add(int index, E element) {
        if (index <= fixSize - 1) {
            super.add(index, element);
        } else throw new FixedSizeListException("Размер списка не может быть изменен и является константным");
    }

    @Override
    public E remove(int index) {
        throw new FixedSizeListException("Размер списка не может быть изменен и является константным");
    }

    @Override
    public boolean remove(Object o) {
        throw new FixedSizeListException("Размер списка не может быть изменен и является константным");
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        if (c.size() <= fixSize) {
            return super.addAll(c);
        } else throw new FixedSizeListException("Размер списка не может быть изменен и является константным");
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        if ((index + c.size() + 1) <= fixSize) {
            return super.addAll(index, c);
        } else throw new FixedSizeListException("Размер списка не может быть изменен и является константным");
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new FixedSizeListException("Размер списка не может быть изменен и является константным");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new FixedSizeListException("Размер списка не может быть изменен и является константным");
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        throw new FixedSizeListException("Размер списка не может быть изменен и является константным");
    }

}
