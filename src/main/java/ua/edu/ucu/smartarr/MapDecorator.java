package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

public class MapDecorator extends SmartArrayDecorator{
    MyFunction myf;
    public MapDecorator(SmartArray arr, MyFunction func) {
        super(arr);
        this.myf = func;
    }

    @Override
    public Object[] toArray() {
        Object[] insideArr = smartArray.toArray();
        int size = insideArr.length;
        for (int i = 0; i < size; ++ i) {
            insideArr[i] = myf.apply(insideArr[i]);
        }
        return insideArr;
    }

    @Override
    public String operationDescription() {
        return "Processing each element through the function...";
    }

    @Override
    public int size() {
        return 0;
    }
}