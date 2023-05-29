package eu.devseal.geizhalsscraper.data;

public enum CssQuery {
    PRODUCT_LISTINGS("div.row.offer"),
    SHIPPING_COST("div.offer__delivery div.offer__delivery-payment span.gh_extracost"),
    COMPANY("div.offer__merchant a"),
    COMPANY_ATTRIBUTE("data-merchant-name"),
    UNIT_PRICE("div.offer__price span");
    public final String geizhals;

    CssQuery(String geizhals) {
        this.geizhals = geizhals;
    }
    }
