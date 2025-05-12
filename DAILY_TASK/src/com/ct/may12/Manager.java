package com.ct.may12;

class Manager extends Employee {
    private ManagerType type;

    public Manager(String name, int employeeId, double salary, ManagerType type) {
        super(name, employeeId, salary);
        this.type = type;
        setSalary(salary);
    }

    public ManagerType getType() {
        return type;
    }

    public void setType(ManagerType type) {
        this.type = type;
    }

    public void setSalary(double salary) {
        if (type == ManagerType.HR) {
            super.setSalary(salary + 10000);
        } else if (type == ManagerType.SALES) {
            super.setSalary(salary + 5000);
        } else {
            super.setSalary(salary);
        }
    }
}