package com.example.doctors2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DoctorController {
    @GetMapping("/doctor/{number}")
    public String getDoctorName(@PathVariable int number) {
        return switch (number) {
            case 1 -> "William Hartnell";
            case 2 -> "Patrick Troughton";
            case 3 -> "Jon Pertwee";
            case 4 -> "Tom Baker";
            default -> "Unknown Doctor";
        };
    }

    @GetMapping("/")
    public String getDoctorLinks() {
        return "<ul>" +
                "<li><a href='/doctor/1'>Doctor 1</a></li>" +
                "<li><a href='/doctor/2'>Doctor 2</a></li>" +
                "<li><a href='/doctor/3'>Doctor 3</a></li>" +
                "<li><a href='/doctor/4'>Doctor 4</a></li>" +
                "</ul>";
    }
}