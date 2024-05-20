package kz.example;


public class CustomLinkedList {
    private Node head;

    private int size;

    public CustomLinkedList() {
        this.size = 0;
    }

    public void print() {
        if(head != null) {
            Node currentNode = head;
            System.out.print("[");
            while (currentNode.getNextNode() != null) {
                System.out.print(currentNode.getData() + ", ");
                currentNode = currentNode.getNextNode();
            }
            System.out.println(currentNode.getData() + "]");
        } else {
            System.out.println("[]");
        }
    }

    public void add(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node newNode = new Node(data);
        if (index == 0) {
            newNode.setNextNode(head);
            head = newNode;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNextNode();
            }
            newNode.setNextNode(currentNode.getNextNode());
            currentNode.setNextNode(newNode);
        }
        size++;
    }

    public void add(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
        } else {
            Node currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(node);
        }
        size++;
    }


    public void remove(int data) throws Exception {
        if (head == null) {
            throw new Exception("the list is empty");
        }
        Node currentNode = head;
        if(currentNode.getData() == data) {
            removeFirst();
            return;
        }
        while (currentNode.getNextNode() != null) {
            if(currentNode.getNextNode().getData() == data) {
                break;
            }
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        size--;

    }

    public void removeInddex(int index) throws Exception {
        if (head == null) {
            throw new Exception("the list is empty");
        }
        if (index < 0) {
            throw new Exception("The index goes beyond the list: " + index);
        }
        if (index == 0) {
            head = head.getNextNode();
            return;
        }

        Node currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            if (currentNode.getNextNode() == null) {
                throw new Exception("The index goes beyond the list: " + index);
            }
            currentNode = currentNode.getNextNode();
        }

        if (currentNode.getNextNode() == null) {
            removeLast();
        }

        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        size--;
    }

    public void removeFirst() throws Exception{
        if (head == null) {
            throw new Exception("the list is empty");
        }
        head = head.getNextNode();
        size--;
    }

    public void removeLast() throws Exception{
        if (head == null) {
            throw new Exception("the list is empty");
        }
        if (head.getNextNode() == null) {
            head = null;
        } else {
            Node currentNode = head;
            while (currentNode.getNextNode().getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(null);
        }
        size--;
    }

    public int size() throws Exception {
        if (head == null) {
            throw new Exception("the list is empty");
        }
        return this.size;
    }

    public void clear(){
        this.head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public int indexOf(int data) throws Exception {
        if (head == null) {
            throw new Exception("the list is empty");
        }
        int index = 0;
        if (head.getData() == data) {
            return index;
        } else {
            Node currentNode = head;
            while (currentNode != null) {
               if (currentNode.getData() == data) {
                 return index;
               }
               index++;
               currentNode = currentNode.getNextNode();
            }
            throw new Exception("number not found");
        }
    }

    public void set(int index, int data) throws Exception {
        if (head == null) {
            throw new Exception("the list is empty");
        }
        if (index < 0 || index > size) {
            throw new Exception("Invalid index: " + index);
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setData(data);
        currentNode.setNextNode(currentNode.getNextNode());
        size++;
    }

    public boolean contains(int data) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData() == data) {
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        return false;
    }

    public int[] toArray() {
        int size = 0;
        Node currentNode = head;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.getNextNode();
        }
        int[] array = new int[size];

        currentNode = head;
        for (int i = 0; i < size; i++) {
            array[i] = currentNode.getData();
            currentNode = currentNode.getNextNode();
        }

        return array;
    }
}

