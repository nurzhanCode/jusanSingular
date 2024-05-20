package kz.example;


public class App {
    public static void main(String[] args) throws Exception {
        CustomLinkedList list = new CustomLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.set(1,7);
      int array1 [] =  list.toArray();
        //list.clear();
        //list.print();
        for (int i = 0; i < list.size()-1; i++) {
            System.out.println(array1[i]);
        }


        // void add(int index, int data); +
        // int get(int index); +
        // int getFirst(); +
        // int getLast(); +
        // boolean contains(int data);+
        // void clear();+
        // int indexOf(int data); +
        // void remove(int data); +
        // void remove(int index); +
        // void removeFirst(); +
        // void removeLast(); +
        // void set(int index, int data);+
        // int size();+
        // int[] toArray();
        // boolean isEmpty()+


    }
}
