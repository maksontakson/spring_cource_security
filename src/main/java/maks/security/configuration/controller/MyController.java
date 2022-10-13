package maks.security.configuration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getInfoForAllEmps() {
        return "all-employees";
    }

    @GetMapping("/hr-info")
    public String getInfoOnlyForHR() {
        return "hr";
    }

    @GetMapping("/manager-info")
    public String getIngoOnlyForManagers() {
        return "manager";
    }
}
