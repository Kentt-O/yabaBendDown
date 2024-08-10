package org.example.DTOs.Request;

import lombok.Getter;
import lombok.Setter;
import org.example.data.model.Category;
import org.example.data.model.Client;

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
