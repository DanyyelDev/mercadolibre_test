package com.hackerrank.sample.product.domain.model;

public class ColorOption {
    private String name;
    private String hexCode;
    private String imageUrl;

    public ColorOption(){}

    public ColorOption(String name, String hexCode) {
        this.name = name;
        this.hexCode = hexCode;
    }

    public ColorOption(String name, String hexCode, String imageUrl) {
        this.name = name;
        this.hexCode = hexCode;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHexCode() {
        return hexCode;
    }

    public void setHexCode(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

