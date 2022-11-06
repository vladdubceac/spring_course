package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import hibernate_one_to_one.entity.Detail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//            Department dep = new Department("Sales",1500, 800);
//            Employee emp1 = new Employee("Zaur","Tregulov",800);
//            Employee emp2 = new Employee("Elena","Smirnova",1000);
//            Employee emp3 = new Employee("Anton","Sidorov",1200);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//
//            Transaction transaction = session.beginTransaction();
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
            // *************************************
            session = factory.getCurrentSession();

            Transaction transaction = session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class,3);

            System.out.println("Show department");
            System.out.println(department);

            System.out.println("Load employees");
            department.getEmployees().iterator().next();

            session.getTransaction().commit();

            System.out.println("Show employees of the department");
            System.out.println(department.getEmployees());

            System.out.println("Done!");
            // **********************************
//            session = factory.getCurrentSession();
////
////            Transaction transaction = session.beginTransaction();
////            Employee employee = session.get(Employee.class, 1);
////
////            System.out.println(employee);
////            System.out.println(employee.getDepartment());
////
////            session.getTransaction().commit();
////            System.out.println("Done!");
            // ****************************
//            session = factory.getCurrentSession();
//
//            Transaction transaction = session.beginTransaction();
//            Employee employee = session.get(Employee.class, 2);
//
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
