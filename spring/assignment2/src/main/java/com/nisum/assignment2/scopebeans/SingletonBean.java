package com.nisum.assignment2.scopebeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonBean {
    public String getMessage() {
        return "Singleton: " + this.hashCode();
    }
}
