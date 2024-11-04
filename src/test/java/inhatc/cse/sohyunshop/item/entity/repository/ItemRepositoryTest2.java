package inhatc.cse.sohyunshop.item.entity.repository;

import inhatc.cse.sohyunshop.item.entity.Item;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;



    @Test
    public void test(){
        System.out.println("AAAAAAAAAAAAAAAAAAA");
    }

    @Test
    @DisplayName("상품 등록 테스트")
    public void insertItemTest(){
        Item item = Item.builder()
                .itemNm("신상품2")
                .itemDetail("신상품 상세 설명")
                .price(10000)
                .stockNumber(200)
                .build();

        Item savedItem = itemRepository.save(item); //ctrl + 1 눌러서
        System.out.println(savedItem);
        //assertEquals(savedItem.getId(),5);
    }

    @Test
    public void findByItemNmTest(){
        List<Item> itemList = itemRepository.findByItemNm("신상품2");
//        for (Item item : itemList) {
//            System.out.println(item);
//        }
// 아래 람다식이랑 같은 거

        itemList.forEach(item -> System.out.println(item));
        //itemList.forEach(System.out::println);
    }
}