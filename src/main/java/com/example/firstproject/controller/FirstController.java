package com.example.firstproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller //이 클래스가 컨트롤러임을 선언하는 어노테이션. Controller 클래스패키지가 자동으로 임포트된다.
public class FirstController {

    @GetMapping("/hi") //URL 요청을 접수하는 부분.
    //반환형이 문자열인 niceToMeetYou 메서드 작성
    public String niceToMeetYou(Model model) { //model 객체 받아 오기.
        //model 객체가 값을 username에 뎐결해 웹 브라우저로 보냄.
        model.addAttribute("username","irro" );
        return "greetings"; //이 반환문을 이용해 greetings.mustache 페이지 반환.
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname","irro");
        return "goodbye";
    }
}
