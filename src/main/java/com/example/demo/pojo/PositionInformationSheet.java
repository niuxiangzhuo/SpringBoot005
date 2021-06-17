package com.example.demo.pojo;

public class PositionInformationSheet {
    private Integer jobsNumbers;
    private String postTheName;
    private Double postSalary;

    public PositionInformationSheet() {
    }

    public PositionInformationSheet(Integer jobsNumbers, String postTheName, Double postSalary) {
        this.jobsNumbers = jobsNumbers;
        this.postTheName = postTheName;
        this.postSalary = postSalary;
    }

    public Integer getJobsNumbers() {
        return jobsNumbers;
    }

    public void setJobsNumbers(Integer jobsNumbers) {
        this.jobsNumbers = jobsNumbers;
    }

    public String getPostTheName() {
        return postTheName;
    }

    public void setPostTheName(String postTheName) {
        this.postTheName = postTheName;
    }

    public Double getPostSalary() {
        return postSalary;
    }

    public void setPostSalary(Double postSalary) {
        this.postSalary = postSalary;
    }

    @Override
    public String toString() {
        return "PositionInformationSheet{" +
                "jobsNumbers=" + jobsNumbers +
                ", postTheName='" + postTheName + '\'' +
                ", postSalary=" + postSalary +
                '}';
    }
}
