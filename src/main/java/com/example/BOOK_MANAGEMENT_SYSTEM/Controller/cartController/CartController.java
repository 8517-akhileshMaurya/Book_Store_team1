package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.cartController;

import com.example.BOOK_MANAGEMENT_SYSTEM.Service.cartService.CartService;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.cartModel.Cart;
import com.example.BOOK_MANAGEMENT_SYSTEM.response.CartResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public CartResponse addProductToCart(@RequestParam Long user_id, @RequestParam Long product_id, @RequestParam Integer quantity) {
        return cartService.addProductToCart(user_id, product_id, quantity);
    }
}

