package com.amr.project.webapp.controller;

import com.amr.project.service.abstracts.MainPageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    private final MainPageService mainPageService;

    public MainPageController(MainPageService mainPageService) {
        this.mainPageService = mainPageService;
    }

    @GetMapping("/")
    public String getMainPage(Model model) {
        model.addAttribute("bestRatingShops", mainPageService.getBestRatingShops(12));
        model.addAttribute("bestRatingItems", mainPageService.getBestRatingItems(12));
        return "index";
    }
}
