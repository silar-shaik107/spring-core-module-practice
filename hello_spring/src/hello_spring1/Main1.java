package hello_spring1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		BeanFactory factory = new FileSystemXmlApplicationContext(
				"E:\\ADVJAVA530PMBATCH\\hello_spring\\beans1.xml");
		Student s = (Student) factory.getBean("stu");
		System.out.println(s);
		 Student s1=(Student)factory.getBean("s1");
		 System.out.println(s1);

		 Student s2=(Student)factory.getBean("s2");
		 System.out.println(s2);

	}

}
