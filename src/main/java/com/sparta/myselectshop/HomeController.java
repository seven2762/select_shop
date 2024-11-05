package com.sparta.myselectshop;

import com.sparta.myselectshop.product.dto.ProductRequestDto;
import com.sparta.myselectshop.product.dto.ProductResponseDto;
import com.sparta.myselectshop.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }


}