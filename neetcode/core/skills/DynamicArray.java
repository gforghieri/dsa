package neetcode.core.skills;

class DynamicArray {

    private int[] data;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be non-negative");
        }
        this.capacity = capacity;
        this.data = new int[capacity];
    }

    public int get(int i) {
        return data[i];
    }

    public void set(int i, int n) {
        this.data[i] = n;
    }

    public void pushback(int n) {
        if (this.size == this.capacity) {
            resize();
        }
        this.data[size] = n;
        this.size++;
    }

    public int popback() {
        int last = this.data[this.size - 1];
        this.size--;
        return last;
    }

    private void resize() {
        this.capacity = this.capacity * 2;
        int[] old = this.data;
        this.data = new int[capacity];
        for (int i = 0; i < this.size; i++) {
            this.data[i] = old[i];
        }
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray(10);
        arr.pushback(10);
        arr.pushback(20);
        arr.pushback(30);
        System.out.println("Element at index 1: " + arr.get(1));
        arr.set(1, 99);
        System.out.println("Element at index 1 after set: " + arr.get(1));
        System.out.println("Pop back: " + arr.popback());
        System.out.println("Size: " + arr.getSize());
        System.out.println("Capacity: " + arr.getCapacity());
    }
}
