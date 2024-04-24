package com.wellsfargo.counselor.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;
    @ManyToOne
    @JoinColumn(name="portfolio_id")
    @JsonBackReference
    private Portfolio portfolio;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private int quantity;

    protected Security() {

    }

    public Security(String category, Date purchaseDate, float purchasePrice, int quantity) {
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Security{" +
                "securityId=" + securityId +
                ", portfolio=" + portfolio +
                ", category='" + category + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", purchasePrice=" + purchasePrice +
                ", quantity=" + quantity +
                '}';
    }
}
