package com.learning.topic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic/v1")
public class HelloController {

    @GetMapping(value = "/hello")
    public String getDetails()
    {
        return "Once upon a time, there were two siblings named Chotu and Pallu. They were famous in their neighborhood—not for studying or helping at home—but for being unbelievably lazy.\n" +
                "\n" +
                "Every morning, their mother would say,\n" +
                "\"Wake up! It's already 9 o'clock!\"\n" +
                "\n" +
                "Chotu would reply,\n" +
                "\"Five more minutes...\"\n" +
                "\n" +
                "Pallu would answer,\n" +
                "\"Can you wake me up after Chotu wakes up?\"\n" +
                "\n" +
                "One day, the TV remote was just two feet away from them.\n" +
                "\n" +
                "Chotu looked at Pallu and said,\n" +
                "\"Pallu, can you pass me the remote?\"\n" +
                "\n" +
                "Pallu sighed,\n" +
                "\"You are closer.\"\n" +
                "\n" +
                "\"But we're sitting on the same sofa!\"\n" +
                "\n" +
                "\"Exactly. That's why you should take it.\"\n" +
                "\n" +
                "After ten minutes of arguing, their father walked in, picked up the remote, and switched off the TV.\n" +
                "\n" +
                "Another day, they were both hungry.\n" +
                "\n" +
                "Chotu asked,\n" +
                "\"Can you make some noodles?\"\n" +
                "\n" +
                "Pallu replied,\n" +
                "\"I was hoping you'd ask so I could say no.\"\n" +
                "\n" +
                "They finally ordered food online because neither of them wanted to walk to the kitchen.\n" +
                "\n" +
                "Their laziness became legendary.\n" +
                "\n" +
                "One afternoon, it started raining. The window was open, and rainwater was coming inside.\n" +
                "\n" +
                "Chotu said,\n" +
                "\"Pallu, can you close the window?\"\n" +
                "\n" +
                "Pallu replied,\n" +
                "\"If the rain really wants to come in, who are we to stop it?\"\n" +
                "\n" +
                "By evening, the floor was completely wet.\n" +
                "\n" +
                "Their mother couldn't stop laughing and said,\n" +
                "\"I've never seen two people work so hard just to avoid working!\"\n" +
                "\n" +
                "From that day on, Chotu and Pallu promised to become a little more active.\n" +
                "\n" +
                "...They decided they'd start tomorrow.\n" +
                "\n" +
                "And, of course, tomorrow never came!";
    }

}
