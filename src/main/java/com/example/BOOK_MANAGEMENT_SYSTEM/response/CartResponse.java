package com.example.BOOK_MANAGEMENT_SYSTEM.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartResponse {
       private Long cart_id;
       private Long  user_id;
       private String   username;
       private Long  product_id;
       private int  quantity;
}
