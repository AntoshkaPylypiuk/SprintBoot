package com.example.springboot.functions;

import com.example.springboot.essence.Project;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import java.util.List;

public class Functions {

    public List<Project> projectList = new ArrayList<>();

    public void save(@RequestBody Project project){
        System.out.println(project);
        projectList.add(project);
        System.out.println(projectList.size());
    }

    public void name(){
        System.out.println("Projects:");
        for (Project project : projectList){
            System.out.println(project.getProject());
        }
    }

    public void timeLong(){
        System.out.println("long compilation:");
        for (Project project : projectList){
            if (project.getCompilationTime() >= 1000){
                System.out.println(project.getProject());
            }
        }
    }

    public void normalTime(){
        System.out.println("Normal compilation:");
        for (Project project : projectList){
            if (project.getCompilationTime() < 1000){
                System.out.println(project.getProject());
            }
        }
    }

    public void failed(){
        System.out.println("failed projects:");
        for (Project project : projectList){
            if (project.getResult().equals("failed")){
                System.out.println(project.getProject());
            }
        }
    }

    public void success(){
        System.out.println("Success projects:");
        for (Project project : projectList){
            if (project.getResult().equals("success")){
                System.out.println(project.getProject());
            }
        }
    }
}
