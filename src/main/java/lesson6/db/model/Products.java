package lesson6.db.model;

import lombok.Data;

@Data

public class Products {

    private Long id;


    private String title;


    private Integer price;


    private Long categoryId;

    public Products(Long id, String title, Integer price, Long categoryId) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.categoryId = categoryId;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }


    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}