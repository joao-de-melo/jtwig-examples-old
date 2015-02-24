package org.jtwig.example;

import org.jtwig.JtwigModelMap;
import org.jtwig.JtwigTemplate;
import org.jtwig.exception.JtwigException;

public class SimpleApp {
    public static void main(String[] args) throws JtwigException {
        String output = JtwigTemplate
            .classpathTemplate("sample.twig")
            .render(new JtwigModelMap().withModelAttribute("name", "Jtwig"));

        System.out.println(output);
    }
}
