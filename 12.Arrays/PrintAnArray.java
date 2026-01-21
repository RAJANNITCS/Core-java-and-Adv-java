//Wap to create an array and display and array

class ArrayDataType{
    public int arr[] = null;
    public int currLength = 0;

    public ArrayDataType(int sizeOfArray) {
        this.arr = new int[sizeOfArray];
    }

    public void addElement(int value) {
        this.arr[this.currLength] = value;
        this.currLength++;
    }

    public void display() {
        for (int i = 0; i < this.currLength; i++) {
            System.out.println("Array elements are " + this.arr[i]);
        }
    }
}

public class PrintAnArray {
    public static void main(String[] args) {
        ArrayDataType objOfArr = new ArrayDataType(10);
        objOfArr.addElement(1);
        objOfArr.addElement(2);
        objOfArr.addElement(3);
        objOfArr.display();
    }
}   