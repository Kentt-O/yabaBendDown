package org.auction.services.Implementation;

import lombok.RequiredArgsConstructor;
import org.auction.data.model.BidEvent;
import org.auction.data.repositories.BidEventRepository;
import org.auction.services.InterfaceSocket.BidEventService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BidEventServiceImpl implements BidEventService {
    private final BidEventRepository bidEventRepository;

    @Override
    public void saveEvent(BidEvent bidEvent) {
        bidEventRepository.save(bidEvent);
    }

    @Override
    public List<BidEvent> getEvents() {
        return bidEventRepository.findAll();
    }
}
