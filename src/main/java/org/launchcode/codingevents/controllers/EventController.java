package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        List<HashMap<String, String>> events = new ArrayList<HashMap<String, String>>();
        String[] keys = new String[]{"language","description","image"};
        String[] tableHeader = new String[]{"Event Language","Description","Image"};
        String[] imgPaths = new String[]{"/images/c++.png","/images/java.png","/images/javascript.png"};
        HashMap<String, String> event1 = new HashMap<String, String>();
        HashMap<String, String> event2 = new HashMap<String, String>();
        HashMap<String, String> event3 = new HashMap<String, String>();

        event1.put(keys[0],"C plus plus");
        event1.put(keys[1], "C++ in finance");
        event1.put(keys[2], imgPaths[0]);

        event2.put(keys[0],"java");
        event2.put(keys[1], "Golf Code with Java");
        event2.put(keys[2], imgPaths[1]);

        event3.put(keys[0],"javascript");
        event3.put(keys[1], "Essentials of java Script in web development");
        event3.put(keys[2], imgPaths[2]);

        events.add(event1);
        events.add(event2);
        events.add(event3);

        //events.put("software architects", "Object oriented code Soft architects");
        model.addAttribute("keys", keys);
        model.addAttribute("tableHeader", tableHeader);
        model.addAttribute("events", events);
        return "events/index";
    }

}
