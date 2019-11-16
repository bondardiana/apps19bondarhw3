package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {

    private Object[] nArray;

    public BaseArray(Object[] nArray){
        this.nArray = nArray;
    }

    @Override
    public Object[] toArray() {
        int size = nArray.length;
        Object[] tmp = new Object[size];
        System.arraycopy(nArray, 0, tmp, 0, size);
        return tmp;
    }

    @Override
    public String operationDescription() {
        return "Base artay for decorators";
    }

    @Override
    public int size() {
        return nArray.length;
    }
}
