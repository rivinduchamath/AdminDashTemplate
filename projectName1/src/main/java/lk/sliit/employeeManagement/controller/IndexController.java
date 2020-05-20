package lk.sliit.employeeManagement.controller;


import lk.sliit.employeeManagement.service.custom.IndexBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class  IndexController { //index.jsp Page Controller
@Autowired
    IndexBO indexBO;

@RequestMapping("/")
public String loginPage(){
    return "index";
}

}//End class
