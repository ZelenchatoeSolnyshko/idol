package org.example;

import org.example.list.MySimpleList;
import org.example.list.QueueStrategy;
import org.example.list.StackStrategy;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        QueueStrategy<Integer> queueStrategy = new QueueStrategy<>();
        StackStrategy<Integer> stackStrategy = new StackStrategy<>();
        MySimpleList<Integer> list = new MySimpleList<>(queueStrategy);
        list.add(5);
        list.add(7);
        list.setListStrategy(stackStrategy);
        list.add(10);
        list.add(154);

        //iter-1
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        //iter-2
        list.forEach(System.out::println);

        //iter-3
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}