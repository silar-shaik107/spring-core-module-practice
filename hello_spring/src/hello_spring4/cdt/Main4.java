package hello_spring4.cdt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main4 {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"E:\\ADVJAVA530PMBATCH\\hello_spring\\beans4.xml");
		Student std1 = (Student) context.getBean("student");
		System.out.println("*****1st Student Details*****");
		System.out.println(std1.getStuName());
		System.out.println(std1.getStuId());
		System.out.println(std1.getPassedOutYear());
		System.out.println(std1.getAvgOfMarks());
		System.out.println(std1.getisSelected());
		
		
		System.out.println("*****2nd Student Details*****");
		Student std2 = (Student) context.getBean("student1");
		System.out.println(std2.getStuName());
		System.out.println(std2.getStuId());
		System.out.println(std2.getPassedOutYear());
		System.out.println(std2.getAvgOfMarks());
		System.out.println(std2.getisSelected());
	}

}
