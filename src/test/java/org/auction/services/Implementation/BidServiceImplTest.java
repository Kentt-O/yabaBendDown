package org.auction.services.Implementation;

import org.auction.DTOs.Request.BidRequest;
import org.auction.DTOs.Response.BidResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BidServiceImplTest {
    @Autowired
    private BidServiceImpl bidService;
    @Autowired
    private BidEventServiceImpl bidEventService;

    @Test
    public void customerCanPlaceBidTest(){
        BidRequest placeBidRequest = new BidRequest();
        placeBidRequest.setCustomerId("customer001");
        placeBidRequest.setBidAmount(new BigDecimal("100.00"));

        BidResponse response = bidService.placeBid(placeBidRequest);

        assertThat(response).isNotNull();
        assertThat(response.getBidAmount()).isEqualByComparingTo("100.00");
        assertThat(response.getCustomerId()).isEqualTo("customer001");
    }
}