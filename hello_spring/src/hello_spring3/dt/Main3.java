package hello_spring3.dt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main3 {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("E:\\ADVJAVA530PMBATCH\\hello_spring\\beans3.xml");
                         Student std=(Student) context.getBean("student1");
                         System.out.println(std.getStuName());
                         System.out.println(std.getStuId());
                         System.out.println(std.getAvgOfMarks());
                         System.out.println(std.getPassedOutYear());
                         System.out.println(std.isSelected());
	}
	

}
