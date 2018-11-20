package com.summer.left.sakila.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * sales_by_store
 * @author 
 */
public class SalesByStore implements Serializable {
    private String store;

    private String manager;

    private BigDecimal totalSales;

    private static final long serialVersionUID = 1L;

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
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
        SalesByStore other = (SalesByStore) that;
        return (this.getStore() == null ? other.getStore() == null : this.getStore().equals(other.getStore()))
            && (this.getManager() == null ? other.getManager() == null : this.getManager().equals(other.getManager()))
            && (this.getTotalSales() == null ? other.getTotalSales() == null : this.getTotalSales().equals(other.getTotalSales()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStore() == null) ? 0 : getStore().hashCode());
        result = prime * result + ((getManager() == null) ? 0 : getManager().hashCode());
        result = prime * result + ((getTotalSales() == null) ? 0 : getTotalSales().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", store=").append(store);
        sb.append(", manager=").append(manager);
        sb.append(", totalSales=").append(totalSales);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}