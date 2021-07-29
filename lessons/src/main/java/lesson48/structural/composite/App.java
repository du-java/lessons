package lesson48.structural.composite;

public class App {
    public static void main(String[] args) {
        final SalesDepartment sales = new SalesDepartment(1, "sales");
        final FinancialDepartment fin = new FinancialDepartment(2, "fin");
        final ItDepartment it = new ItDepartment(3, "it");

        final HeadDepartment head = new HeadDepartment(4, "head");
        head.addDepartment(sales);
        head.addDepartment(fin);
        head.addDepartment(it);

        head.printDepartmentName();
    }
}
