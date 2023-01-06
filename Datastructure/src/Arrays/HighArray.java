package Arrays;


public class HighArray<E> implements Liit<E> {

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    transient Object[] elementData;

    protected int size;

    public HighArray(int initialCapacity) {
        if (initialCapacity > 0)
            this.elementData = new Object[initialCapacity];
        else
            throw new IllegalArgumentException("Illegal Capacity " + initialCapacity);
    }

    public HighArray() {
        int defaultCapacity = 10;
        this.elementData = new Object[defaultCapacity];
    }

    public void add(E e, Object[] elementData, int size) {
        if (size == elementData.length) {
            throw new ArrayIndexOutOfBoundsException("Incraese the siz eof Array");
        }
        elementData[size] = e;
    }

    @Override
    public boolean add(E e) {
        add(e, elementData, size);
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
         remove(o,elementData);
         return true;
    }
     private  E remove(Object o,Object[] elementData)
     {

         for (int i = 0; i < size; i++) {
             if (elementData(i).equals(o))
             {
                 return remove(o,elementData ,i);
             }
         }
         throw new NullPointerException();
     }

     private  E remove(Object o,Object[] elementData,int index)
     {
         final Object[] ar=elementData;
         E oldvalue= elementData(index);
         System.arraycopy(ar,index+1,elementData,size,(size-1)-index);

         size=size-1;
         return oldvalue;
     }

    @Override
    public void display() {
        for (int i = 0; i < size; i++)
            System.out.print(elementData[i] + " ");
    }

    @Override
    public E get(int size) {
        if (size < this.size) {
            return elementData(size);
        } else
            throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public E set(int index, E element) {
        if (index > size) throw new ArrayIndexOutOfBoundsException("index is high");
        E oldValue = elementData(index);
        elementData[index] = element;
        return oldValue;
    }

    @Override
    public void add(int index, E element) {

    }

    E elementData(int size) {
        return (E) elementData[size];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return contains(o, elementData);
    }

    private boolean contains(Object o, Object[] elementData) {
        for (int i = 0; i < size; i++) {
            if (elementData(i).equals( o)) return true;
        }
        return false;
    }
}

class High {
    public static void main(String[] args) {
        HighArray<String> a = new HighArray<String>(6);
        a.add("prem");
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.display();
        System.out.println();
      a.remove("b");

      a.display();

    }


}
