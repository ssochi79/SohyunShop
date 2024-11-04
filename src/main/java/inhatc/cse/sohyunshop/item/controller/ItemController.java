package inhatc.cse.sohyunshop.item.controller;

import inhatc.cse.sohyunshop.item.dto.ItemDataDto;
import inhatc.cse.sohyunshop.item.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemController {
    @GetMapping("/admin/item/add")
    public String itemAdd(){
        return "item/add";
    }
    @GetMapping("/admin/items")
    public String itemList(){
        return "item/list";
    }

    @GetMapping("/item/thymeleaf1")
    public String thymeleaf1(Model model) {
        ItemDto itemDto = ItemDto.builder()
                .id(1L)
                .itemNm("상품명")
                .itemDetail("상품 상세 설명")
                .price(10000)
                .stockNumber(100)
                .build();

        model.addAttribute("item", itemDto);

        return "item/thymeleaf1";
    }

    @GetMapping("/item/thymeleaf2")
    public String thymeleaf2(//@RequestParam("name") String test,
                             // @RequestParam("age") int age,
                             ItemDataDto itemDataDto,
                             Model model){
        System.out.println("============" + itemDataDto);

        model.addAttribute("item", itemDataDto);

        return "item/thymeleaf2";
    }
}
