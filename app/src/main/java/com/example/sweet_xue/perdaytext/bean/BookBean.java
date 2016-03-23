package com.example.sweet_xue.perdaytext.bean;

/**
 * Created by sweet_xue on 23/3/16.
 */
public class BookBean {

    private String id;
    private String cat_id;
    private String title;
    private String content;
    private String add_time;
    private String status;
    private String tags;
    private String types;
    private String views;
    private String good;
    private String bad;
    private String recommend;

    public BookBean() {
    }

    public BookBean(String id, String cat_id, String title, String content, String add_time, String status, String tags, String types, String views, String good, String bad, String recommend) {
        this.id = id;
        this.cat_id = cat_id;
        this.title = title;
        this.content = content;
        this.add_time = add_time;
        this.status = status;
        this.tags = tags;
        this.types = types;
        this.views = views;
        this.good = good;
        this.bad = bad;
        this.recommend = recommend;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCat_id() {
        return cat_id;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAdd_time() {
        return add_time;
    }

    public void setAdd_time(String add_time) {
        this.add_time = add_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getBad() {
        return bad;
    }

    public void setBad(String bad) {
        this.bad = bad;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }


    @Override
    public String toString() {
        return "BookBean{" +
                "id='" + id + '\'' +
                ", cat_id='" + cat_id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", add_time='" + add_time + '\'' +
                ", status='" + status + '\'' +
                ", tags='" + tags + '\'' +
                ", types='" + types + '\'' +
                ", views='" + views + '\'' +
                ", good='" + good + '\'' +
                ", bad='" + bad + '\'' +
                ", recommend='" + recommend + '\'' +
                '}';
    }
}
