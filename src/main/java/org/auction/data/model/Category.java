package org.auction.data.model;

import org.auction.exceptions.CategoryNotFoundException;

public enum Category {
    ELECTRONICS,
    FASHION,
    HOME_AND_GARDEN,
    SPORTS,
    TOYS,
    AUTOMOTIVE,
    ART,
    COLLECTIBLES;

    public static Category getObjectCategory(String category) throws CategoryNotFoundException{
        for (Category search : values()) {
            if (search.name().equalsIgnoreCase(category)) {
                return search;
            }
        }
        throw new CategoryNotFoundException("Category not found: " + category);
    }
}
