package org.auction.DTOs.Request;

import lombok.Getter;
import lombok.Setter;
import org.auction.data.model.Category;
import org.auction.data.model.Client;

import java.util.Date;

@Setter
@Getter
public class CreateAuctionRequest {
    private String itemName;
    private String description;
    private Client client;
    private Category category;
    private Date auctionDate;
}
