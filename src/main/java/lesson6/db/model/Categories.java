package lesson6.db.model;

import lombok.Data;

@Data

public class Categories {

    private Long id;

    private String title;

    public Categories(Long id, String title) {
        this.id = id;
        this.title = title;
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
}