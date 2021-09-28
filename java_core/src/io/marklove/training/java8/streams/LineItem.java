package io.marklove.training.java8.streams;

import java.math.BigDecimal;

public class LineItem {
    private Integer id;
    private String item;
    private Integer qty;
    private BigDecimal price;
    private BigDecimal total;

    public LineItem(int id, String item, int qty, BigDecimal price, BigDecimal total) {
        this.id = id;
        this.item = item;
        this.qty = qty;
        this.price = price;
        this.total = total;
    }

    public LineItem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}
