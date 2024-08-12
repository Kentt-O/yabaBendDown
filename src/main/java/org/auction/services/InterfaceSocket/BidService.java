package org.auction.services.InterfaceSocket;

import org.auction.DTOs.Request.BidRequest;
import org.auction.DTOs.Response.BidResponse;

public interface BidService {
    BidResponse placeBid(BidRequest bidRequest);
}
