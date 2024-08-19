package org.auction.web;

import lombok.RequiredArgsConstructor;
import org.auction.DTOs.Request.ClientAuctionRequest;
import org.auction.DTOs.Request.LoginRequest;
import org.auction.DTOs.Response.ClientAuctionResponse;
import org.auction.DTOs.Response.LoginResponse;
import org.auction.services.InterfaceSocket.ClientServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AuctionController {
    private final ClientServices clientService;

    @PostMapping("/uploadItem")
    public ResponseEntity<?> auctionItem(@RequestBody ClientAuctionRequest clientAuctionRequest){
        try{
            ClientAuctionResponse clientAuctionResponse = clientService.auctionItem(clientAuctionRequest);
            return ResponseEntity.ok().body(clientAuctionRequest);
        }catch (Exception exception){
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
}
