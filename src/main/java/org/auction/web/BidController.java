package org.auction.web;


import org.auction.DTOs.Request.BidRequest;
import org.auction.DTOs.Response.BidResponse;
import org.auction.services.InterfaceSocket.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bids")
public class BidController {
    @Autowired
    private BidService bidService;

    @PostMapping
    public ResponseEntity<BidResponse> placeBid(@RequestBody BidRequest bidRequest){
        BidResponse response = bidService.placeBid(bidRequest);
        return ResponseEntity.ok(response);
    }

}
