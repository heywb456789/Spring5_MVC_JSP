package com.minjae.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice")
public class NoticeController {

    @RequestMapping("/list")
    public String list(){
        return "";
    }

    @RequestMapping("/reg")
    @ResponseBody
    public String reg(String title, String content, String category, String[] foods, MultipartFile file){

        String fileName = file.getOriginalFilename();
        long size = file.getSize();

        System.out.println("fileName : "+fileName +"size : "+ size);

        return String.format("title : %s , content : %s , cate : %s", title, content, category);
    }

    @RequestMapping("/edit")
    public String edit(){
        return "";
    }

    @RequestMapping("/delete")
    public String delete(){
        return "";
    }

}
