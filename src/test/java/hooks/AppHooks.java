package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AppHooks {

//    @BeforeStep(value = "@sanity", order = 2)
//    public void before_step1(){
//        System.out.println("..........Running before step 1 hook...............");
//    }
//    @BeforeStep(order = 1)
//    public void before_step2(){
//        System.out.println("..........Running before step 2 hook...............");
//    }
//    @AfterStep(order = 2)
//    public void after_step1(){
//        System.out.println("..........Running After step 1 hook...............");
//    }
//
//    @AfterStep(order = 1)
//    public void after_step2(){
//        System.out.println("..........Running After step 2 hook...............");
//    }

    @Before(value = "@sanity", order = 2)
    public void before1(){
        System.out.println("..........Running before hook 1...............");
    }

    @Before(value = "@functional",order = 1)
    public void before2(){
        System.out.println("..........Running before hook 2...............");
    }
//
//    @After(order = 2)
//    public void after1(){
//        System.out.println("..........Running After hook 1...............");
//    }
//
//    @After(order = 1)
//    public void after2(){
//        System.out.println("..........Running After hook 2...............");
//    }

}
