package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageletController {

    @GetMapping ("/pagelet1")
    public String pagelet1( Model model) {
     return "pagelet1";
    }
    @GetMapping ("/pagelet2")
    public String pagelet2( Model model) {
     return "pagelet2";
    }

    private void simulateProcessingDelay() {
        try {
            // Simulate some processing time (e.g., fetching data from a database)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}