package com.minjae.web.controller.customer;

import com.minjae.web.entity.Notice;
import com.minjae.web.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/customer/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/list")
    public String list(@RequestParam(name = "page" , defaultValue = "1")String page){

//        try {
//            List<Notice> list = noticeService.getList(1,"TITLE","");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        String p = request.getParameter("p");
        System.out.println(page);
        return "notice.list";
    }

    @RequestMapping("/detail")
    public String detail(){
        return "notice.detail";
    }
}
