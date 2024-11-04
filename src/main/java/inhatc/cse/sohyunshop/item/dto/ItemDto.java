package inhatc.cse.sohyunshop.item.dto;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ItemDto {
    private Long id;            // 상품 아이디

    private String itemNm;      // 상품명

    private int price;          // 가격

    private int stockNumber;   // 재고 수량

    private String itemDetail; // 상품 상세 설명

    private LocalDateTime regTime;

    private LocalDateTime updateTime;
}
