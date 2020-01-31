package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kamdem
 */
public class EventData {
    // need a place to put events (Integer are the IdS)
    private static final Map<Integer, Event> events = new HashMap<>();

    // get all events
    public static Collection<Event> getAll(){
        return  events.values();
    }

    // get a single event
    public static Event getById(int id){
        return events.get(id);
    }

    // add an event
    public static void add(Event event){
        events.put(event.getId(), event);
    }

    // remove an event
    public static void removeById(int id){
        events.remove(id);
    }
}
