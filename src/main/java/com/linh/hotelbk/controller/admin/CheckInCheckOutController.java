package com.linh.hotelbk.controller.admin;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(path = "/admin")
@Api(tags = "Controller")
public class CheckInCheckOutController {

    @GetMapping(path = "/checkin-checkout")
    public ModelAndView getCheckPage(){
        ModelAndView mv = new ModelAndView("admin/checkin-checkout");
        return mv;
    }
}
