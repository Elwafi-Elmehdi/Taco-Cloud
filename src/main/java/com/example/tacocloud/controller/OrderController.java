package com.example.tacocloud.controller;

import com.example.tacocloud.domain.TacoOrder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;

@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(DesignTacoController.class);

    @GetMapping("/current")
    public String orderForm() {
        return  "orderForm";
    }

    @PostMapping
    public String processOrder(@Valid TacoOrder order, Errors errors,
                               SessionStatus sessionStatus) {
        if(errors.hasErrors()){
            return "orderForm";
        }

        LOGGER.info("Order submitted: {}", order);
        sessionStatus.setComplete();
        return "redirect:/";
    }
}
