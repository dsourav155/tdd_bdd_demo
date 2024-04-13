package com.sourav.tddbdddemo.bdd;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.Given;

public class StepDefinitions {

    @Given("I want to test using cucumber {int} times")
    public void I_want_to_test_using_cucumber_times(int times) {
        assertThat(times).isGreaterThanOrEqualTo(times);
        for (int i = 0; i < times; i++) {
        	 System.out.println("I'm testing");
		}
    }
    @Given("I want to say Hello {int} times")
    public void sayHello(int times) {
        for (int i = 0; i < times; i++) {
        	 System.out.println(i + " Hello");
		}
    }
    
    @Given("I love programming in {string} rather than {string}")
    public void iLoveXOverY(String lang1, String lang2) {
    	System.out.println("I like " + lang1 + " over " + lang2);
    }
    
    
    
    

}
