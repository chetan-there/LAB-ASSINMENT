package com.ct.collection_day4.task1;

import java.util.ArrayList;

class Directory {
    private ArrayList<Employee> employees;

    public Directory() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
    }

    public void updateEmployee(int index, String position, double salary) {
        if (index >= 0 && index < employees.size()) {
            Employee emp = employees.get(index);
            emp.setPosition(position);
            emp.setSalary(salary);
        }
    }

    public void deleteEmployee(int index) {
        if (index >= 0 && index < employees.size()) {
            employees.remove(index);
        }
    }
}