package inhatc.cse.sohyunshop.item.controller;

import inhatc.cse.sohyunshop.item.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafExController {
    @GetMapping("/thymeleafEx/thymeleafEx04")
    public String thymeleafExample03(Model model){
        List<ItemDto> itemDtoList = new ArrayList<>();

        for(int i=1; i<=10; i++){
            ItemDto itemDto = ItemDto.builder()
                    .itemNm("테스트 상품" + i)
                    .price(10000 * i)
                    .itemDetail("테스트 상품 상세 설명" + i)
                    .regTime(LocalDateTime.now())
                    .build();
            itemDtoList.add(itemDto);
        }

        model.addAttribute("itemDtoList", itemDtoList);
        return "thymeleafEx/thymeleafEx04";
    }
}
