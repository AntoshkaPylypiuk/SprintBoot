package com.example.springboot.controller;

import com.example.springboot.essence.Project;
import com.example.springboot.functions.Functions;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    Functions functions = new Functions();

    @RequestMapping(value = "/register-compilation-time", method = RequestMethod.POST)
    public String saveProject(@RequestBody Project project){
        functions.save(project);
        return "Project saved successfully -- " + project;
    }

    @RequestMapping("/projects")
    public void returnName(){
        functions.name();
    }

    @RequestMapping("/long-compilation")
    public void longCompilation(){
        functions.timeLong();
    }

    @RequestMapping("/normal-compilation")
    public void normalCompilation(){
        functions.normalTime();
    }

    @RequestMapping("/failed-results")
    public void failedProjects() {
        functions.failed();
    }

    @RequestMapping("/success-result")
    public void successProjects(){
        functions.success();
    }
}
