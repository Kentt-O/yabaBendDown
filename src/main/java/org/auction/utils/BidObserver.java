package org.auction.utils;

import org.auction.data.model.BidEvent;

public interface BidObserver {
    void update(BidEvent bidEvent);
}
