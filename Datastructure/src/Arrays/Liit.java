package Arrays;

public interface Liit <E>{

        int size();

        boolean isEmpty();

        boolean contains(Object o);

        boolean add(E e);

        boolean remove(Object o);

        boolean equals(Object o);

        E get(int index);

        E set(int index, E element);

        void add(int index, E element);

        void display();
    }

