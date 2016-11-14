package com.aiop.yourtask.persistence;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.aiop.yourtask.persistence.Employee;
import com.aiop.yourtask.service.*;

public class TestEmployee {
	
	//private static SessionFactory factory;
	//private static ServiceRegistry serviceRegistry;
	
	
	public static void main(String[] args) {
		
		DiaryService diaryservice = new DiaryService();
		Diary diary = diaryservice.findById(1);
		
		DiaryEntryService diaryentryservice = new DiaryEntryService();
		
		DiaryResourceService diaryresourceservice = new DiaryResourceService();
		
		GoalService goalservice = new GoalService();
		/*
		GoalService goalservice = new GoalService();
		Goal goal = new Goal("nomGoal","madescription",diary.getDiaryId());
		goalservice.persist(goal);
		
		DiaryEntryService diaryentryservice = new DiaryEntryService();
		DiaryEntry diaryentry = new DiaryEntry(new java.sql.Date(System.currentTimeMillis()),"okcontent",false,diary.getDiaryId());
		diaryentryservice.persist(diaryentry);
		
		DiaryResourceService diaryresourceservice = new DiaryResourceService();
		DiaryResource diaryresource = new DiaryResource("type","monurl",diaryentry.getDiaryEntryId());
		diaryresourceservice.persist(diaryresource);
		*/
		DiaryResource diaryresource = diaryresourceservice.findById(1);
		DiaryEntry diaryentry = diaryentryservice.findById(1);
		Goal goal = goalservice.findById(1);
		
		System.out.println("YYYYYYYYYYYYYYYYEEEEEEEEEEESSSSSSSSSSSSSSSSSSSS");
		System.out.println("XXDIARYRESOURCE: " + diaryresourceservice.findByDiaryEntry(diaryentry));
		/*System.out.println("YYYYYYYYYYYYYYYYEEEEEEEEEEESSSSSSSSSSSSSSSSSSSS");
		System.out.println("XXDIARY: " + diaryservice.findAll());
		System.out.println("YYYYYYYYYYYYYYYYEEEEEEEEEEESSSSSSSSSSSSSSSSSSSS");
		System.out.println("XXGOAL: " + goalservice.findByDiary(diary));*/
		
		/* NOTIFICATION 
		NotificationService ns = new NotificationService();
		UserService us = new UserService();
		User u = us.findById(8);
		List<Notification> notifications = ns.findByUser(u);
		
		System.out.println(notifications);
		*/
		
		
		
		/* ROLE RESOURCE 
		RoleResourceService roleResourceService = new RoleResourceService();
		
		RoleService roleService = new RoleService();
		Role role = roleService.findById(1);
		
		List<RoleResource> roleresources = roleResourceService.findByRole(role);
		
		ResourceService resourceservice = new ResourceService();
		
		for(RoleResource item : roleresources){
			System.out.println(resourceservice.findByRoleResource(item));
		} 
		*/
		// START SERVICE ROLERESOURCE
				/*
			 RoleResourceService roleResourceService = new RoleResourceService();
			 
			 RoleResourcePK roleResourcePK = new RoleResourcePK();
			 roleResourcePK.setResourceId(1);
			 roleResourcePK.setRoleId(1);
			 
			 RoleResource roleresource = new RoleResource();
			 roleresource.setRoleResourcePK(roleResourcePK);
			 roleresource.setRightRole(true);
			

			 System.out.println("*** Persist - start ***");
			 
			 roleResourceService.
			 
			 
			 List<UserSuinfo> products1 = productService.findAll();
			 System.out.println("Books Persisted are :");
			 for (UserSuinfo b : products1) {
				 System.out.println("-" + b.toString());
			 }
			 System.out.println("*** Persist - end ***");	
				
			 SuinfoService suinfoService = new SuinfoService();
			 Suinfo suinfo = suinfoService.findByUserSuinfoEntity(emp);
			 suinfo.toString();
			 System.out.println("SU INFO FIRSTNAME = " + suinfo.getSuinfoFirstname());
			 */
			
		// END SERVICE ROLERESOURCE
		
		
		/*
		
		// START SERVICE (new package) SCINFO
		
		 ScinfoService scinfoService = new ScinfoService();
		 UserService userService = new UserService();
		 ProductService productService = new ProductService();
		 
		 
		 
		 User user = new User(new java.sql.Date(System.currentTimeMillis()), "0608983599", "gg@mail.fr", "78","45200", "montpel","johny","jona","e",new java.sql.Date(System.currentTimeMillis()),"scinfo","9999999",1);
		 //userService.persist(user);
		 
		 Scinfo scinfo = new Scinfo("9999","industrie","www.fr.fr",user.getUserId());
		 //scinfoService.persist(scinfo);
		 
		 Product p1 = new Product("etagere","solide","img link",10.5,8,user.getUserId());
		 Product p2 = new Product("meuble","solide","img link",1555,8,user.getUserId());
		 //productService.persist(p1);
		 //productService.persist(p2);
		 
		 User u = userService.findById(7);
		 
		 System.out.println("PRODDDDDUUUUUCTS DE MON USER : " + productService.findByUser(u));
		 
		 
		// END SERVICE SCINFO
		*/
		
		// START SERVICE USERSUINFO
		/*
			 UserSuinfoService productService = new UserSuinfoService();
			 
	
			 UserSuinfoPK empPK = new UserSuinfoPK();
			 empPK.setSuinfoId(2);
			 empPK.setUserId(3);
			 
			 UserSuinfo emp = new UserSuinfo();
			 emp.setUserSuinfoPK(empPK);
			
			 System.out.println("*** Persist - start ***");
			 
			 productService.persist(emp);
			 
			 
			 List<UserSuinfo> products1 = productService.findAll();
			 System.out.println("Books Persisted are :");
			 for (UserSuinfo b : products1) {
				 System.out.println("-" + b.toString());
			 }
			 System.out.println("*** Persist - end ***");	
				
			 SuinfoService suinfoService = new SuinfoService();
			 Suinfo suinfo = suinfoService.findByUserSuinfoEntity(emp);
			 suinfo.toString();
			 System.out.println("SU INFO FIRSTNAME = " + suinfo.getSuinfoFirstname());
			 */
				// END SERVICE USERSUINFO
		
		
		// START SERVICE PRODUCT
		/*
				 ProductService productService = new ProductService();
				 
				 Product emp1 = new Product("The Brothers Karamazov", "Fyodor Dostoevsky","ok",11.2,11,3);
				 Product emp2 = new Product("The Brothers efdfKaramazov", "Fyodor Dostoevsky","ok",11.2,11,3);
				 Product emp3 = new Product("The Brothers Karamadddzov", "Fyodor Dostoevsky","ok",11.2,11,3);
				
				 System.out.println("*** Persist - start ***");
				 
				 productService.persist(emp1);
				 productService.persist(emp2);
				 productService.persist(emp3);
				 
				 
				 List<Product> products1 = productService.findAll();
				 System.out.println("Books Persisted are :");
				 for (Product b : products1) {
					 System.out.println("-" + b.toString());
				 }
				 System.out.println("*** Persist - end ***");	
		*/
		// END SERVICE PRODUCT
		
		
		// START SERVICE
		/*
		 EmployeeService employeeService = new EmployeeService();
		 
		 Employee emp1 = new Employee(111, "The Brothers Karamazov", "Fyodor Dostoevsky");
		 Employee emp2 = new Employee(121, "The Brothers efdfKaramazov", "Fyodor Dostoevsky");
		 Employee emp3 = new Employee(133, "The Brothers Karamadddzov", "Fyodor Dostoevsky");
		
		 System.out.println("*** Persist - start ***");
		 
		 employeeService.persist(emp1);
		 employeeService.persist(emp2);
		 employeeService.persist(emp3);
		 
		 
		 List<Employee> employees1 = employeeService.findAll();
		 System.out.println("Books Persisted are :");
		 for (Employee b : employees1) {
			 System.out.println("-" + b.toString());
		 }
		 System.out.println("*** Persist - end ***");	
		 */
		 /*
		 System.out.println("*** Update - start ***");
		 Employee another = employeeService.findById(12);
		 another.setEmployeeName("Upddddadaaateeeedd");
		 employeeService.update(another);
		 System.out.println("Book Updated is =>" +employeeService.findById(another.getEmployeeId()));
		 System.out.println("*** Update - end ***");	
		 
		 System.out.println("*** Find - start ***");
		 int id1 = emp1.getEmployeeId();
		 Employee another = employeeService.findById(id1);
		 System.out.println("Book found with id " + id1 + " is =>" + another.toString());
		 System.out.println("*** Find - end ***");
		 
		 System.out.println("*** Delete - start ***");
		 Employee another = employeeService.findById(12);
		 int id3 = another.getEmployeeId();
		 employeeService.delete(another);
		 System.out.println("Deleted book with id " + id3 + ".");
		 System.out.println("Now all books are " + employeeService.findAll().size() + ".");
		 System.out.println("*** Delete - end ***");
		 
		 System.out.println("*** FindAll - start ***");
		 List<Employee> employees2 = employeeService.findAll();
		 System.out.println("Books found are :");
		 for (Employee b : employees2) {
			 System.out.println("-" + b.toString());
		 }
		 System.out.println("*** FindAll - end ***");
		 
		 System.out.println("*** DeleteAll - start ***");
		 employeeService.deleteAll();
		 System.out.println("Books found are now " + employeeService.findAll().size());
		 System.out.println("*** DeleteAll - end ***");
		 System.exit(0);
		 */
		// END SERVICE
		
		
		/*
		
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Employee.class);
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				configuration.getProperties()).build();
		
		factory = configuration.buildSessionFactory(serviceRegistry);
		TestEmployee testWorker = new TestEmployee();
		
		//testWorker.addEmployee(2, "JavaCodeGeeks_modifié", "401");
		testWorker.addEmployee(30, "troisieme insertion", "401");
		testWorker.addEmployee(40, "quatre", "401");
		
		List<Employee> allEmployees = testWorker.getAllEmployees();
		for(Employee emp : allEmployees){
			System.out.print(emp.getEmployeeId() + "  ");
			System.out.print(emp.getEmployeeName() + "  ");
			System.out.print(emp.getDeptId() + "  ");
			System.out.println();
		}
		*/
		 
	}
	
	/*
	private int addEmployee(int empId, String empName, String deptId) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer empIdSaved = null;
		try {
			tx = session.beginTransaction();
			Employee emp = new Employee(empId, empName, deptId);
			empIdSaved = (Integer) session.save(emp);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return empIdSaved;
	}
	
	@SuppressWarnings("unchecked")
	private List<Employee>  getAllEmployees(){
		Session session = factory.openSession();
		Transaction tx = null;
		List<Employee> employees = new ArrayList<Employee>();
		try {
			tx = session.beginTransaction();
			employees = (List<Employee>)session.createQuery("FROM Employee").list(); 
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return employees;
	}
	*/
	
}
