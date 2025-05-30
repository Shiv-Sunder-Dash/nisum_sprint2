package com.nisum.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        TextEditor te1 = (TextEditor) context.getBean("textEditorConstructor");
        te1.spellCheck();

        TextEditor te2 = (TextEditor) context.getBean("textEditorSetter");
        te2.spellCheck();
    }
}

