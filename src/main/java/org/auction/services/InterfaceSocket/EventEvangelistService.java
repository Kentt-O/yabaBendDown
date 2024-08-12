package org.auction.services.InterfaceSocket;

import org.auction.data.model.BidEvent;
import org.auction.utils.BidObserver;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface EventEvangelistService {

    void addObserver(BidObserver bidObserver);
    void removeObserver(BidObserver bidObserver);
    void publishEvent(BidEvent bidEvent);
}
