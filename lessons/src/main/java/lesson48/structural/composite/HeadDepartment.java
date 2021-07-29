package lesson48.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment extends AbstractDepartment {
    private final List<Department> childDepartments;

    public HeadDepartment(int id, String name) {
        super(id, name);
        childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}
