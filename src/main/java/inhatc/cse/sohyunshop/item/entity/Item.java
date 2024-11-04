package inhatc.cse.sohyunshop.item.entity;

import inhatc.cse.sohyunshop.item.constant.ItemSellStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {

    @Id // 기본키 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    @Column(name = "item_id") // 컬럼명 변경
    private Long id;


    @Column(nullable = false, length = 50)
    private String itemNm;

    private int price;

    @Column(name = "stock")
    private  int stockNumber;

    private LocalDate regTime; // 등록시간
    private LocalDateTime updateTime;

    @Lob
    @Column(nullable = false)
    private  String itemDetail;

}
