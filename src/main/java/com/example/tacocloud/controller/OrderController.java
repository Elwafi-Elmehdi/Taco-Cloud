package com.example.tacocloud.controller;

import com.example.tacocloud.domain.TacoOrder;
import com.example.tacocloud.domain.User;
import com.example.tacocloud.props.OrderProps;
import com.example.tacocloud.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    private OrderProps orderProps;
    private OrderRepository orderRepo;
    @Autowired
    public OrderController(OrderProps orderProps, OrderRepository orderRepo) {
        this.orderProps = orderProps;
        this.orderRepo = orderRepo;
    }



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

    @GetMapping
    public String ordersForUser(
            @AuthenticationPrincipal User user, Model model) {
        Pageable pageable = PageRequest.of(0, orderProps.getPageSize());
        model.addAttribute("orders",
                orderRepo.findByUserOrderByPlacedAtDesc(user,pageable));
        return "orderList";
    }
}
