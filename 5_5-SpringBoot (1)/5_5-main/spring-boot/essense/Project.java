package com.example.springboot.essence;

public class Project {

    private String project;
    private String timestamp;
    private int compilationTime;
    private String result;

    public Project(String project, String timestamp, int compilationTime, String result) {
        this.project = project;
        this.timestamp = timestamp;
        this.compilationTime = compilationTime;
        this.result = result;
    }

    public String getProject() {
        return project;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public int getCompilationTime(){
        return compilationTime;
    }

    public String getResult() {
        return result;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setCompilationTime(int compilationTime) {
        this.compilationTime = compilationTime;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Project{" +
                "project='" + project + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", compilationTime=" + compilationTime +
                ", result='" + result + '\'' +
                '}';
    }
}
