package com.tikjuti.bus_ticket_booking.dto.request.ZaloPay;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CallbackRequest {
    String data;
    String mac;
    int type;
}
