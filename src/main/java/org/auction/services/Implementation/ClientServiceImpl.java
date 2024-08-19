package org.auction.services.Implementation;

import lombok.RequiredArgsConstructor;
import org.auction.DTOs.Request.ClientAuctionRequest;
import org.auction.DTOs.Response.ClientAuctionResponse;
import org.auction.data.model.Auction;
import org.auction.data.repositories.AuctionRepository;
import org.auction.services.InterfaceSocket.ClientServices;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientServices {
    private final AuctionRepository auctionRepository;

    @Override
    public ClientAuctionResponse auctionItem(ClientAuctionRequest clientAuctionRequest) {
        // TODO: Implement auction logic
        Auction auction = new Auction();
         auction.setId(clientAuctionRequest.getAuctionId());
         auction.setItemName(clientAuctionRequest.getItemName());
         auction.setStartBid(clientAuctionRequest.getStartingPrice());
         auction.setDescription(clientAuctionRequest.getDescription());
         auctionRepository.save(auction);

         ClientAuctionResponse response = new ClientAuctionResponse();
         response.setAuctionId(auction.getId());

         return response;
    }
}
