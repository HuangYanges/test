package com.test.hy.test.books.Entity;

public class BookEntity {

    //书名
    private String bookName;
    //价格
    private double jage;
    //图片地址
    private String image;
    //书号
    private String inbo;
    //作者
    private String zuozhe;

    public BookEntity() {
    }

    public BookEntity(String bookName, double jage, String image, String inbo, String zuozhe) {
        this.bookName = bookName;
        this.jage = jage;
        this.image = image;
        this.inbo = inbo;
        this.zuozhe = zuozhe;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getJage() {
        return jage;
    }

    public void setJage(double jage) {
        this.jage = jage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInbo() {
        return inbo;
    }

    public void setInbo(String inbo) {
        this.inbo = inbo;
    }

    public String getZuozhe() {
        return zuozhe;
    }

    public void setZuozhe(String zuozhe) {
        this.zuozhe = zuozhe;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookName='" + bookName + '\'' +
                ", jage=" + jage +
                ", image='" + image + '\'' +
                ", inbo='" + inbo + '\'' +
                ", zuozhe='" + zuozhe + '\'' +
                '}';
    }
}
