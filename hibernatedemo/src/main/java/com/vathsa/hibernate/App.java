package com.vathsa.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.vathsa.hibernate.dao.EmployeeDAO;
import com.vathsa.hibernate.entity.Address;
import com.vathsa.hibernate.entity.Course;
import com.vathsa.hibernate.entity.Department;
import com.vathsa.hibernate.entity.Employee;
import com.vathsa.hibernate.entity.Person;
import com.vathsa.hibernate.entity.Student;
import com.vathsa.hibernate.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
      SessionFactory factory = HibernateUtil.buildSessionFactory();
      Session session = factory.openSession();
      Course c = session.get(Course.class, "Core java");
      if(c!=null)
      {
    	  System.out.println(c.getCourseName()+" "+c.getCourseDuration()+" "+
                               c.getCourseFee()+" "+c.getFacultyName());
    	  for(Student s : c.getStudents())
    		  System.out.println(s.getStudentName()+" "+s.getMobileNo()+" "+
    		     s.getStudentAddress());
      }
      Student s = session.get(Student.class, 8001);
      if(s!=null)
    	  System.out.println(s.getStudentName()+" "+s.getMobileNo()+" "+
             s.getStudentAddress());
      for(Course c1 : s.getCourses())
      {
    	  System.out.println(c1.getCourseName()+" "+c1.getCourseDuration()+" "+
                     c1.getCourseFee()+" "+c1.getFacultyName());
      }
      session.close();
      HibernateUtil.shutdown(); 
    }
}































//Employee e1 = new Employee(102,"Vijay",2000,20);
//Employee e2 = new Employee(103,"Raju",3000,30);

//edao.modifyEmployee(new Employee(103,"Balayya",3300,33));
//edao.deleteEmployee(new Employee(101,"",0,0));
//Session session = factory.openSession();
//Transaction trans = session.beginTransaction();

//Employee e1 = session.get(Employee.class,101);

//System.out.println("is session dirty "+session.isDirty());
//session.save(e);
//session.save(e2);
//    trans.commit();
//  session.close();


//Person p  = session.get(Person.class, 787);
//if(p!=null)
//{
//	  System.out.println(p.getSsn()+" "+p.getPersonName()+" "+p.getPersonAge()+" "+p.getGender());
//	  System.out.println(p.getAddress().getHouseNo()+" "+p.getAddress().getStreetName()
//			  +" "+p.getAddress().getCityName()+" "+p.getAddress().getStateName());
//}
//Address a = session.get(Address.class, 7001);
//if(a!=null)
//{
//	  System.out.println(a.getHouseNo()+" "+a.getStreetName()+" "+a.getCityName()+" "+a.getStateName());
//	  System.out.println(a.getPerson().getSsn()+" "+a.getPerson().getPersonName()+" "+a.getPerson().getPersonAge()
//			  +" "+a.getPerson().getGender());
//}