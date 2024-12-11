package com.assignment.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MainController {
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String index() {
        return "index.jsp";
    }
    @RequestMapping(value = "/date", method=RequestMethod.GET)
    public String date(Model model) {
        Date currentDate = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("EEEE, MMM dd, yyyy");
        String formatedDate = formatDate.format(currentDate);
        model.addAttribute("date", formatedDate);
        return "date.jsp";
    }
    @RequestMapping(value = "/time", method=RequestMethod.GET)
    public String time(Model model) {
        Date currentDate = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("h:mm a");
        String formatedDate = formatDate.format(currentDate);
        model.addAttribute("time", formatedDate);
        return "time.jsp";
    }
    
}
