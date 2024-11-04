package inhatc.cse.sohyunshop.start.controller;

import inhatc.cse.sohyunshop.start.dto.StartDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {

    @GetMapping("/")
    public String start(Model model){
        StartDto startDto = StartDto.builder()
                .dept("컴시과")
                .name("전소현")
                .build();
        model.addAttribute("data",startDto);
        return "temp/temp";
    }
}