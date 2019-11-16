package ua.edu.ucu.smartarr;

// Remove duplicates from SmartArray. Use method equals() to compare objects

import java.util.Arrays;


// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray arr) {
        super(arr);
    }


    @Override
    public Object[] toArray() {

        Object[] insideArr = smartArray.toArray();
        boolean exit = false;
        int size = insideArr.length;
        Object[] tmp = new Object[size + 1];
        int count = 0;
        for (int i = 0; i < size; ++i) {
            for (int j = i + 1; j < size; ++j) {
                if (insideArr[i].equals(insideArr[j])) {
                    exit = true;
                    break;
                }
            }
            if (!exit) {
                tmp[count] = insideArr[i];
                count++;
            }
            exit = false;

    }
        return Arrays.copyOf(tmp, count);
    }

    @Override
    public String operationDescription() {
        return "Removing duplicates from array...";
    }
    @Override
    public int size() {
        return toArray().length;
    }
}