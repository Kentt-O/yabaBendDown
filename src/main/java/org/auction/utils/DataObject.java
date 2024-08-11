package org.auction.utils;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document
@ToString
@NoArgsConstructor
public class DataObject {
    private String authorization_url;
    private String access_code;
    private String reference;
}
