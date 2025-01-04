package com.example.demo.web.template

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {
    @GetMapping("/")
    fun home(model: Model): String {
        model.addAttribute("username", "Elan");
        return "pages/home";
    }

    @GetMapping("/team")
    fun  team( model: Model): String {
        var teamMembers = listOf("Alice", "Bob", "Charlie", "David");
        model.addAttribute("teamMembers", teamMembers);
        return "pages/team";
    }

    @GetMapping("/projects")
    fun  projects(model: Model): String {
        var projects = listOf("Project 1", "Project 2", "Project 3");
        model.addAttribute("username", "John Doe");
        model.addAttribute("projects",projects);
        return "pages/projects";
    }
}