package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Date;

public class ClientDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Course.class);
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        insertCourse(sf);
        viewCourse(sf, 1);
        
        sf.close();
    }
    
    public static void insertCourse(SessionFactory sf) {
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Course course = new Course();
        course.setName("Full Stack Application Development");
        course.setDescription("Learn full stack development with Java and Spring");
        course.setDate(new Date());
        course.setStatus("Active");
        
        session.save(course);
        tx.commit();
        session.close();
        
        System.out.println("Course inserted successfully!");
    }
    
    public static void viewCourse(SessionFactory sf, int id) {
        Session session = sf.openSession();
        
        Course course = session.get(Course.class, id);
        
        if (course != null) {
            System.out.println("\n--- Course Details ---");
            System.out.println("ID: " + course.getId());
            System.out.println("Name: " + course.getName());
            System.out.println("Description: " + course.getDescription());
            System.out.println("Date: " + course.getDate());
            System.out.println("Status: " + course.getStatus());
        } else {
            System.out.println("Course not found with ID: " + id);
        }
        
        session.close();
    }
}
