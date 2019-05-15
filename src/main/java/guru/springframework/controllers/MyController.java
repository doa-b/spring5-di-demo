package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Doa on 15-5-2019.
 */
@Controller
public class MyController {

    public String hello() {
        System.out.println("Hello");

        return "foo";
    }
}
