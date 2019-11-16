package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;

public class FilterDecorator extends SmartArrayDecorator {
    MyPredicate mypr;

    public FilterDecorator(SmartArray arr, MyPredicate pred) {
        super(arr);
        this.mypr = pred;
    }


    @Override
    public Object[] toArray() {
        Object[] insideArr = smartArray.toArray();
        int size = insideArr.length;
        Object[] tmp = new Object[size];
        int count = 0;
        for (int i = 0; i < size; ++i) {
            if (mypr.test(insideArr[i])) {
                tmp[count] = insideArr[i];
                count+=1;
            }
        }
        return Arrays.copyOf(tmp, count);
    }

    @Override
    public String operationDescription() {
        return "Filtering array according to predicate...";
    }

    @Override
    public int size() {
        return toArray().length;
    }
}