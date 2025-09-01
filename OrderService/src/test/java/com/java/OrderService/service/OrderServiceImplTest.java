/*
package com.java.OrderService.service;

import com.java.OrderService.entity.Order;
import com.java.OrderService.external.client.PaymentService;
import com.java.OrderService.external.client.ProductService;
import com.java.OrderService.external.response.PaymentResponse;
import com.java.OrderService.model.OrderResponse;
import com.java.OrderService.model.PaymentMode;
import com.java.OrderService.repository.OrderServiceRepository;
import com.java.ProductService.model.ProductResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.time.Instant;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OrderServiceImplTest {

    @Mock
    private OrderServiceRepository orderRepository;

    @Mock
    private ProductService productService;

    @Mock
    private PaymentService paymentService;

    @InjectMocks
    OrderService orderService = new OrderServiceImpl();

    @DisplayName("Get Order - Success Scenario")
    @Test
    void test_When_Order_Success() {

        Order order = getMockOrder();

        when(orderRepository.findById(anyLong())).thenReturn(Optional.of(order));
        when(productService.getProductById(order.getProductId())).thenReturn(ResponseEntity.ok(getMockProductResponse()));
        when(paymentService.getPaymentDetailsByOrderId(String.valueOf(order.getId()))).thenReturn(ResponseEntity.ok(getMockPaymentResponse()));

        OrderResponse orderResponse = orderService.getOrderDetails(1);

        verify(orderRepository, times(1)).findById(anyLong());
        verify(productService, times(1)).getProductById(1l);
        verify(paymentService, times(1)).getPaymentDetailsByOrderId(String.valueOf(order.getId()));


        assertNotNull(orderResponse);
        assertEquals(order.getId(), orderResponse.getOrderId());
    }

    private Order getMockOrder() {
        return Order.builder()
                .orderStatus("PLACED")
                .orderDate(Instant.now())
                .id(1)
                .amount(100)
                .quantity(200)
                .productId(2)
                .build();
    }

    private PaymentResponse getMockPaymentResponse() {
        return PaymentResponse.builder()
                .paymentId(1)
                .paymentDate(Instant.now())
                .paymentMode(PaymentMode.CASH)
                .amount(200)
                .orderId(1)
                .status("ACCEPTED")
                .build();
    }

    private ProductResponse getMockProductResponse() {
        return ProductResponse.builder()
                .productId(2)
                .productName("iPhone")
                .price(100)
                .quantity(200)
                .build();
    }

}*/
