package com.minjae.web.controller.admin.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
        return "admin.board.notice.list";
    }

//    @RequestMapping(value = "/reg", method = RequestMethod.GET)// 3.x 버전
    @GetMapping("/reg") //3.x 이후
//    @ResponseBody
    public String reg() {
        return "admin.board.notice.reg";
    }

//    @RequestMapping(value = "/reg", method = RequestMethod.POST) // 3.x 버전
//    @ResponseBody
    @PostMapping("/reg")
    public String reg(String title, String content, String category,
                      String[] foods, MultipartFile[] files, HttpServletRequest request){
        for(MultipartFile file : files) {
            String fileName = file.getOriginalFilename();
            long size = file.getSize();

            System.out.println("fileName : " + fileName + "size : " + size);

//        ServletContext ctx = request.getServletContext();

            String webPath = "/static/upload";
            String realPath = ctx.getRealPath(webPath);

            //경로에 dir 존재하는지
            File savePath = new File(realPath);
            if (!savePath.exists()) {
                savePath.mkdirs();
            }

            realPath += File.separator + fileName;
            File saveFile = new File(realPath);

            try {
                file.transferTo(saveFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

//        return String.format("title : %s , content : %s , cate : %s", title, content, category);
        return "admin.board.notice.list";
    }

    @RequestMapping("/edit")
    public String edit(){
        return "admin.board.notice.edit";
    }

    @RequestMapping("/delete")
    public String delete(){
        return "admin.board.notice.list";
    }

}
