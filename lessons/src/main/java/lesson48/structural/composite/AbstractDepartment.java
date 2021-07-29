package lesson48.structural.composite;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractDepartment implements Department {

    protected int id;
    protected String name;

    public AbstractDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(this.getClass().getSimpleName());
    }
}
