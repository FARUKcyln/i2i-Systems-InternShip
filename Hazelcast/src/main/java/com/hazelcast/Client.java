package com.hazelcast;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.map.IMap;

public class Client {
    public static void main(String[] args) {
        HazelcastInstance hzClient = null;
        try {
            hzClient = HazelcastClient.newHazelcastClient();
            IMap<Long, String> testMap = hzClient.getMap("testMap");
            System.out.println(testMap.get(11L));
        }finally {
            hzClient.shutdown();
        }
    }
}
