package org.sussanacode.model;

public class Employee{

    protected String fullName;
    protected String status;
    protected String gender;
    protected int batchId;
    protected String department;

    /**
     *
     * default constructor
     */
    public Employee() {

    }

    public Employee(String fullName, String status, String gender, int batchId, String department) {
        this.fullName = fullName;
        this.status = status;
        this.gender = gender;
        this.batchId = batchId;
        this.department = department;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", status='" + status + '\'' +
                ", gender='" + gender + '\'' +
                ", batchId=" + batchId +
                ", department='" + department + '\'' +
                '}';
    }
}

