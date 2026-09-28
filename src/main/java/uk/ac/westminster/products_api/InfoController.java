package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class InfoController {
    @GetMapping("/getinfo")
    public String getinfo(){
        return "Info Controller API Running"+LocalDate.now().toString();
    }
}
