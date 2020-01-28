/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples.jsf.page;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@Named("welcomePageBean")
@RequestScoped
public class WelcomePageBean {
    
    private String welcomeUserName;
    private String completedGreeting;

    /**
     * @return the welcomeUserName
     */
    public String getWelcomeUserName() {
        return welcomeUserName;
    }

    /**
     * @param welcomeUserName the welcomeUserName to set
     */
    public void setWelcomeUserName(String welcomeUserName) {
        this.welcomeUserName = welcomeUserName;
    }

    /**
     * @return the completedGreeting
     */
    public String getCompletedGreeting() {
        return completedGreeting;
    }

    /**
     * @param completedGreeting the completedGreeting to set
     */
    public void setCompletedGreeting(String completedGreeting) {
        this.completedGreeting = completedGreeting;
    }
    
    public void sayHello() {
        completedGreeting = "Hello, " + welcomeUserName;
    }
}
