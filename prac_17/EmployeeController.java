package ru.maksim.ikbo2021.new_pracs.prac_17;

public class EmployeeController {
    Employee model = new Employee();
    EmployeeView view = new EmployeeView();

    public EmployeeController() {
    }

    public void setEmployeeName(String name) {
        this.model.setName(name);
    }

    public String getEmployeeName(String name) {
        return this.model.getName();
    }

    public void setEmployeeHourPayment(Integer payment) {
        this.model.setHourPayment(payment);
    }

    public void setEmployeeHours(Integer hours) {
        this.model.setHours(hours);
    }

    public String getEmployeeHourPayment() {
        return this.model.getHourPayment().toString();
    }

    public String getEmployeeHours() {
        return this.model.getHours().toString();
    }

    public void updateView() {
        this.view.displayDataEmployee(this.model.getName(), this.model.getSalary().toString());
    }
}
