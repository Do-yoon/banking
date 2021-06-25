package com.doyoon.openbanking.v0.index;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Controller
@GetMapping("")
public class IndexController {
    // admin page
    @GetMapping("/")
    public String index(Model model) {
        return "index.html";
    }
}
