package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.*;
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
//            Department dep = new Department("HR",1500, 500);
//            Employee emp1 = new Employee("Oleg","Ivanovo",800);
//            Employee emp2 = new Employee("Andrey","Sidorov",1000);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            Transaction transaction = session.beginTransaction();
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//
//            Transaction transaction = session.beginTransaction();
//            Department department = session.get(Department.class,1);
//
//            System.out.println(department);
//            System.out.println(department.getEmployees());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

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

            session = factory.getCurrentSession();

            Transaction transaction = session.beginTransaction();
            Department department = session.get(Department.class, 1);

            session.delete(department);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
