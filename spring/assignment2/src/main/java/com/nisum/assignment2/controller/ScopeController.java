package com.nisum.assignment2.controller;
import org.springframework.beans.factory.ObjectFactory;
import com.nisum.assignment2.scopebeans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScopeController {

    @Autowired
    private SingletonBean singletonBean;
    @Autowired
    private ObjectFactory<PrototypeBean> prototypeBeanFactory;
    @Autowired
    private RequestBean requestBean;
    @Autowired
    private SessionBean sessionBean;
    @Autowired
    private AppScopeBean appScopeBean;

    @RequestMapping("/")
    public String showScopes(Model model) {
        model.addAttribute("singleton", singletonBean.getMessage());
        model.addAttribute("prototype", prototypeBeanFactory.getObject().getMessage());
        model.addAttribute("request", requestBean.getMessage());
        model.addAttribute("session", sessionBean.getMessage());
        model.addAttribute("application", appScopeBean.getMessage());
        return "index";
    }
}

