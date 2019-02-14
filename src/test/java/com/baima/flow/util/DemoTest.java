package com.baima.flow.util;

public class DemoTest {


    private static Instance _instance = null;


    class Instance {

        public Instance() {
        }
         Instance getSelf() {
            return new Instance();
        }
    }

    public static Instance getInstance() {

        if (_instance == null) {
        }
        return _instance;
        }
    }
