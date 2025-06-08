class DynamicArray {

    public DynamicArray(int capacity) {

    }

    public int get(int i) {

    }

    public void set(int i, int n) {

    }

    public void pushback(int n) {

    }

    public int popback() {

    }

    private void resize() {

    }

    public int getSize() {

    }

    public int getCapacity() {

    }

    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();
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
