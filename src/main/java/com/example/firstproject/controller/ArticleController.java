package com.example.firstproject.controller;

import com.example.firstproject.dto.AritcleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller //컨트롤러 선언.
public class ArticleController { //URL 요청 접수.
    @GetMapping("/articles/new") //메서드 생성 및 반환값 작성.
    public String newArticleForm() {
        return "articles/new";
    }


    @PostMapping("/articles/create") //뷰 페이지에서 폼 데이터를 post방식으로 전송 -> 컨트롤러에서 받을 때도 postmapping으로 받음.
    public String createArticle(AritcleForm form){ //폼 데이터를 DTO로 받기
        System.out.println("DTO 받기"+form.toString()); //DTO에 폼 데이터가 잘 담겼는지 확인

        return "";
    }
}
