package com.summer.left.sakila.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * sales_by_film_category
 * @author 
 */
public class SalesByFilmCategory implements Serializable {
    private String category;

    private BigDecimal totalSales;

    private static final long serialVersionUID = 1L;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SalesByFilmCategory other = (SalesByFilmCategory) that;
        return (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getTotalSales() == null ? other.getTotalSales() == null : this.getTotalSales().equals(other.getTotalSales()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getTotalSales() == null) ? 0 : getTotalSales().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", category=").append(category);
        sb.append(", totalSales=").append(totalSales);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}