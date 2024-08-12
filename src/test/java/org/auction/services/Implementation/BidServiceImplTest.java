package org.auction.services.Implementation;

import org.auction.DTOs.Request.BidRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BidServiceImplTest {
    @Autowired
    private BidServiceImpl bidService;
    @Autowired
    private BidEventServiceImpl bidEventService;

    @Test
    public void customerCanPlaceBidTest(){
        BidRequest placeBid = new BidRequest();
        placeBid.setCustomerId("Shank");
        placeBid.setBidAmount(new BigDecimal("30_000"));
    }
}