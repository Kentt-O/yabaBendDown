package org.auction.DTOs.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.auction.utils.DataObject;

public class PaymentResponse {
    private boolean status;
    private String message;

    @JsonProperty("data")
    private DataObject dataObject;
}
