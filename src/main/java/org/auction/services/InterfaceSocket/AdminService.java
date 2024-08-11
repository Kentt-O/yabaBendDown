package org.auction.services.InterfaceSocket;

import org.auction.DTOs.Request.CreateAuctionRequest;
import org.auction.DTOs.Response.CreateAuctionResponse;

public interface AdminService {
    CreateAuctionResponse addAuctionItem(CreateAuctionRequest createAuctionRequest);
    void confirmAdmin(AdminRequest adminRequest);
    void removeItem(AdminRequest adminRequest, RemoveArtistRequest removeArtistRequest);

}
