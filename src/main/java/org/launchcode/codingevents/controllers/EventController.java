package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        Map<String, String> events = new HashMap<String, String>();
        events.put("C plus plus", "C++ in finance");
        events.put("java", "Golf Code with Java");
        events.put("javascript", "Essentials of java Script in web development");
        //events.put("software architects", "Object oriented code Soft architects");
        /*events.add("Code With Pride");
        events.add("Strange Loop");
        events.add("Apple WWDC");
        events.add("SpringOne Platform");*/
        model.addAttribute("events", events);
        return "events/index";
    }

}
