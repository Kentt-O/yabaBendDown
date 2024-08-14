package org.auction.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document
@Data
public class ObjectInAuction {
    private String id;
    private String objectName;
    private String description;
    private Category category;
    private Client client;
    private BigDecimal startBid;
    private BigDecimal finalBid;
    private Date objectUploadDate;
    private Date objectSaleDate;

    private List<Category> categories = new ArrayList<Category>();

//    public void addCategory(Category category) {
//        this.categories.add(category);
//    }
//
//    public void removeCategory(Category category) {
//        this.categories.remove(category);
//    }
}
