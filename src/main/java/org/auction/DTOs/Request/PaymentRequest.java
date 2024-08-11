package org.auction.DTOs.Request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Setter
@Getter
@Document
public class PaymentRequest {
    private String id;
    private String amount;
    private String email;
}
