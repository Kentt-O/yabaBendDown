package org.example.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Document
@Data
public class ObjectInAuction {
    private String id;
    private String objectName;
    private String description;
    private String category;
    private Client client;
    private BigDecimal startBid;
    private BigDecimal finalBid;
    private Date objectUploadDate;
    private Date objectSaleDate;


}
