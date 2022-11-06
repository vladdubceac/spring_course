package hibernate_many_to_many;

import hibernate_one_to_many_bi.entity.Child;
import hibernate_one_to_many_bi.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
////
////            Section section1 = new Section("Football");
////            Child child1 = new Child("Zaur",5);
////            Child child2 = new Child("Masha",7);
////            Child child3 = new Child("Vasya",6);
////            section1.addChildToSection(child1);
////            section1.addChildToSection(child2);
////            section1.addChildToSection(child3);
////
////            session.beginTransaction();
////
////            session.save(section1);
////
////            session.getTransaction().commit();
////            System.out.println("Done!");
            // *******************************************
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Igor",10);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
            // *******************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 3);
//
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
            // *******************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Child child= session.get(Child.class, 6);
//
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
            // *******************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section= session.get(Section.class, 3);
//
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
            // *******************************************
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Zaur",5);
//            Child child2 = new Child("Masha",7);
//            Child child3 = new Child("Vasya",6);
//
//            session.beginTransaction();
//
//            session.save(section1);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.save(child1);
//            session.save(child2);
//            session.save(child3);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
            // *******************************************
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Olya",12);
//            Child child2 = new Child("Grisha",8);
//            Child child3 = new Child("Pavlik",9);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//            *********************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section1 = session
//                    .createQuery("from Section WHERE name='Dance'", Section.class)
//                    .getSingleResult();
//            session.delete(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//            *********************************************
            session = factory.getCurrentSession();

            session.beginTransaction();

            Child child1 = session.createQuery("from Child where firstName='Zaur'",Child.class).uniqueResult();
            session.delete(child1);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
