import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeesMain {
    public static void main(String[] args) {
        List<Employees> list = getEmployeesList();

        for(Employees employees:list)
        {
            System.out.println(employees);
        }

        System.out.println();
        System.out.println("Sorting");

        List<Employees> list1 = getEmployeesList();

        list1.sort(Comparator.naturalOrder());

        list1.forEach(System.out::println);

        System.out.println();


        //ascending order
        System.out.println("Ascending Order Salary");

        Comparator<Employees> salaryComparator = (Employees e1,Employees e2)->Double.compare(e1.salary(), e2.salary());

        list1.sort(salaryComparator);

        list1.forEach(System.out::println);

        System.out.println();


        //descending order
        System.out.println("Descending Order Salary");

        Comparator<Employees> salaryComparatordesc = (Employees e1,Employees e2)->Double.compare(e2.salary(), e1.salary());

        list1.sort(salaryComparatordesc);

        list1.forEach(System.out::println);

        System.out.println();

        System.out.println();

        maxSalary(list,"Male");

    }

    public static List<Employees> getEmployeesList()
    {
        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees(1,"Brian David","Male",4891.19,"Data Coordinator"));
        employees.add(new Employees(5,"Bert David","Male",7891.19,"Food Chemist"));
        employees.add(new Employees(3,"John David","Male",8891.19,"Data Coordinator"));
        employees.add(new Employees(2,"Lala David","Male",9891.19,"Cheif Design Engineer"));
        employees.add(new Employees(4,"Bram David","Male",3891.19,"Project Manager"));
        return employees;
    }

    public static void maxSalary(List<Employees> list,String gender)
    {
        double maxSalary=0;
        for(Employees employees:list)
        {
            if(employees.gender().equals(gender))
            {
                if(employees.salary()>maxSalary)
                {
                    maxSalary = employees.salary();
                }
            }
        }

        System.out.println("Max Salary for gender " + gender+ " is = "+maxSalary);

    }
}
