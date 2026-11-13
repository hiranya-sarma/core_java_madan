package com.headeasylabs.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorItrDemo {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(12);
        data.add(23);
        data.add(36);

        for (int j=0;j<data.size();j++){
           // System.out.println(data.get(j));
        }

        Iterator itr = data.iterator();

        while (itr.hasNext()){
            Integer i = (Integer) itr.next();
            if (i%3==0){
                System.out.println(i);
            }else {
                itr.remove();
            }
        }
        System.out.println(data);
    }
}
