package gic.i4c.tp16.tp16.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
// import org.springframework.*;



@RestController
public class controller {
    @GetMapping(path = "/tp16/task1")
   public ModelAndView task1(){
        return new ModelAndView("task1");
   }
    @GetMapping(path="/tp16/task2")
    // @RequestMapping(value="/tp16/task2", method = RequestMethod.GET)
    
    public ModelAndView task2(){
        return new ModelAndView("task2");
        
    }
   
    @GetMapping(path="/tp16/task3")
    public ModelAndView task3(){
        return new ModelAndView("task3");
    }
    @GetMapping(path="/tp16/task4")
    public ModelAndView task4(){
        return new ModelAndView("task4");
    }
    
   
    @GetMapping(path = "/tp16/task5")
    public ModelAndView task5(){
        return new ModelAndView("task5");
    }
   

}
