package HW_OOP_3_V3;

import java.util.Iterator;

public class LinkedList<T> implements Iterable <T> {

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Element<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T value = current.value;
                current = current.next;
                return value;
            }
        };
    }

    public class Element<T> {
        private T value;
        private Element<T> next;
        private Element<T> previous;

        public Element(T value) {
            this.value = value;
            next = null;
            previous = null;
        }
    }

    Element<T> head;
    Element<T> tail;
    int listSize;

    public LinkedList () {
        head = null;
        tail = null;
        listSize = 0;
    }

    public void add(T data){
        Element<T> ourEl = new Element<>(data);
        if (listSize == 0){
            head = ourEl;
        }
        else {
            tail.next = ourEl;
            ourEl.previous = tail;
        }
        tail = ourEl;
        listSize++;
    }

}