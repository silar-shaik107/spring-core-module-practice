package hello_spring2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
	
		 BeanFactory factory=new FileSystemXmlApplicationContext("E:\\ADVJAVA530PMBATCH\\hello_spring\\target\\beans2.xml");
                      Student student=(Student)factory.getBean("s1");
                      System.out.println("StudentName:"+student.getStudentName());
                      System.out.println("StudentId:"+student.getStudentId());
                      System.out.println("CollegeName"+student.getClgName());
	}

}
