package org.auction.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
public class BidEvent {
    private String bidId;
    private String customerId;
    private String bidAmount;
    private LocalDateTime timeStamp;
}
