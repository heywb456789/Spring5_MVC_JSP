package com.minjae.web.controller.admin.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice")
public class NoticeController {

    @Autowired
    private ServletContext ctx;

    @RequestMapping("/list")
    public String list(){
        return "";
    }

    @RequestMapping("/reg")
    @ResponseBody
    public String reg(String title, String content, String category,
                      String[] foods, MultipartFile file, HttpServletRequest request){

        String fileName = file.getOriginalFilename();
        long size = file.getSize();

        System.out.println("fileName : "+fileName +"size : "+ size);

//        ServletContext ctx = request.getServletContext();

        String webPath = "/static/upload";
        String realPath = ctx.getRealPath(webPath);

        //경로에 dir 존재하는지
        File savePath = new File(realPath);
        if(savePath.exists()){
            savePath.mkdirs();
        }

        realPath += File.separator + fileName;
        File saveFile = new File(realPath);

        try {
            file.transferTo(saveFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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
