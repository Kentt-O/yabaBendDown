package org.auction.services.Implementation;

import lombok.RequiredArgsConstructor;
import org.auction.DTOs.Request.BidRequest;
import org.auction.DTOs.Response.BidResponse;
import org.auction.data.model.BidEvent;
import org.auction.services.InterfaceSocket.BidService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BidServiceImpl implements BidService {
    private final BidEventServiceImpl bidEventService;
    private final EventEvangelistServiceImpl eventEvangelistService;

    @Override
    public BidResponse placeBid(BidRequest bidRequest) {
        BidEvent event = new BidEvent(
                // Remember to Refactor and Generate a bidId that updates on its own
                "customer",
                bidRequest.getCustomerId(),
                bidRequest.getBidAmount(),
                bidRequest.getTimestamp()
        );
        bidEventService.saveEvent(event);
        eventEvangelistService.publishEvent(event);

        BidResponse response = new BidResponse();
//        response.setBidId(event.getBidId());
        response.setCustomerId(event.getCustomerId());
        response.setBidAmount(event.getBidAmount());
//        response.setTimestamp(event.getTimestamp());

        return response;
    }
}
