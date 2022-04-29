package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext contx=new ClassPathXmlApplicationContext("spring.xml");
		TextEditor te=(TextEditor) contx.getBean("texteditorob");
		te.spellCheckFunction();
		// TODO Auto-generated method stub

	}

}
