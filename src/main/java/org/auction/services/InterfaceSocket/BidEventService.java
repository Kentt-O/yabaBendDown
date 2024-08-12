package org.auction.services.InterfaceSocket;

import org.auction.data.model.BidEvent;

import java.util.List;

public interface BidEventService {
    void saveEvent(BidEvent bidEvent);
    List<BidEvent> getEvents();
}
