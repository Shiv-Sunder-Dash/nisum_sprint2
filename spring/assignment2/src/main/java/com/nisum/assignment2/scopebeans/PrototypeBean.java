package com.nisum.assignment2.scopebeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
    public String getMessage() {
        return "Prototype: " + this.hashCode();
    }
}