package com.onemount.onefast.schedule;

import com.onemount.onefast.model.Order;
import com.onemount.onefast.model.OrderType;
import com.onemount.onefast.service.OrderService;
import com.onemount.onefast.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
@EnableScheduling
@ConditionalOnExpression("true")
public class OrderTimeout {

    @Autowired
    private OrderService orderService;

    @Scheduled(fixedRate = 10000)
    public void FixedOrderTimeout() {
        final long ONE_MINUTE_IN_MILLIS=60000;//millisecs
        //Calendar now = Calendar.;
        //long t= now.getTimeInMillis();
        //Date afterAddingTenMins=new Date(t + (10 * ONE_MINUTE_IN_MILLIS));

//        LocalDate localDate = LocalDate.now();
//        List<Order> orders = orderService.findAll();
//        orders.stream().forEach(order -> {
//            LocalDateTime localDateTime = DateTimeUtils.convertToLocalDateTimeViaMilisecond(order.getCreatedAt()).plus(Duration.of(10, ChronoUnit.MINUTES));
//           if (order.getStatus() == OrderType.PENDING && localDateTime.isAfter(LocalDateTime.now())){
//               order.setStatus(OrderType.CANCELED);
//           }
//        });
    }
}
