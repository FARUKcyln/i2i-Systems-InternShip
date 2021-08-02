package com.hazelcast;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

import java.util.ArrayList;
import java.util.Random;


public class Server {
    public static void main(String[] args) {

        HazelcastInstance hzInstance = Hazelcast.newHazelcastInstance();
        Random rndm = new Random();
        int currentNumber;
        long beginTime;
        long endTime;
        int processLenght = 100000;

        IMap<Integer, Integer> map= hzInstance.getMap("numbers");
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < processLenght; i++) {
            randomNumbers.add(rndm.nextInt());
        }


        beginTime = System.currentTimeMillis();
        for (int i = 0; i < processLenght; i++) {
            currentNumber = randomNumbers.get(i);
            map.put(currentNumber, currentNumber);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for put process :" + ((double)(endTime-beginTime))/1000);

        beginTime = System.currentTimeMillis();
        for (int i = 0; i < processLenght; i++) {
            map.get(randomNumbers.get(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for get process :" + ((double)(endTime-beginTime))/1000);
    }
}
