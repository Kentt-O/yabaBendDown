package org.auction.services.Implementation;

import org.auction.data.model.BidEvent;
import org.auction.services.InterfaceSocket.EventEvangelistService;
import org.auction.utils.BidObserver;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventEvangelistServiceImpl implements EventEvangelistService {
    private List<BidObserver> bidObservers = new ArrayList<>();

    @Override
    public void addObserver(BidObserver observer) {
        bidObservers.add(observer);
    }

    @Override
    public void removeObserver(BidObserver observer) {
        bidObservers.remove(observer);
    }

    @Override
    public void publishEvent(BidEvent event) {
        for (BidObserver observer : bidObservers) {
            observer.update(event);
        }
    }
}
