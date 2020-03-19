package com.interfaces;

import java.util.HashMap;
import java.util.Map;

interface Function {
    void call();
}

interface EventBusInterface {
    void addEventListener(String event,Function function);
    void remove(String event, Function function);
    void emit(String event);
}

public class EventBus implements EventBusInterface{
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();

        Function function = new Function() {
            @Override
            public void call() {
                System.out.println("onClicked");
            }
        };
        eventBus.addEventListener("click", function);

        eventBus.emit("click");
        eventBus.remove("click",function);
        eventBus.emit("click");
    }

    private Map<String, Function> map = new HashMap<String, Function>();

    @Override
    public void addEventListener(String event, Function function) {
        map.put(event, function);
    }

    @Override
    public void remove(String event, Function function) {
        map.remove(event);
    }

    @Override
    public void emit(String event) {
        if(!map.isEmpty()){
            map.get(event).call();
        }
    }
}
