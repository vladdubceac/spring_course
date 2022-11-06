package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session=null;

        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Zaur","Tregulov","IT",500);
//            Detail detail=new Detail("Baku","123456789","zaurtregulov@gmail.com");
//
//            employee.setEmpDetail(detail);
//            Transaction transaction = session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg","Smirnov","Sales",700);
//            Detail detail=new Detail("Moscow","987654321","olejka@gmail.com");
//
//            employee.setEmpDetail(detail);
//            Transaction transaction = session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//
//            Transaction transaction = session.beginTransaction();
//            Employee emp = session.get(Employee.class, 1+9);
//            System.out.println(emp!=null ? emp.getEmpDetail() : emp);

            session = factory.getCurrentSession();

            Transaction transaction = session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
