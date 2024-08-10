package org.example.services.InterfaceSocket;

import org.example.DTOs.Request.CreateAuctionRequest;
import org.example.DTOs.Response.CreateAuctionResponse;

public interface AdminService {
    CreateAuctionResponse addAuctionItem(CreateAuctionRequest createAuctionRequest);
    void confirmAdmin(AdminRequest adminRequest);
    void removeItem(AdminRequest adminRequest, RemoveArtistRequest removeArtistRequest);

}
