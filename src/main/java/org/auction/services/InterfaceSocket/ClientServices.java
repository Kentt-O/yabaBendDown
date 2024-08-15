package org.auction.services.InterfaceSocket;

import org.auction.DTOs.Request.ClientAuctionRequest;
import org.auction.DTOs.Response.ClientAuctionResponse;

public interface ClientServices {
    ClientAuctionResponse auctionItem(ClientAuctionRequest clientAuctionRequest);

}
