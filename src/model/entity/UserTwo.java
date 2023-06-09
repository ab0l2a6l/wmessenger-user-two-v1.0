package model.entity;

public class UserTwo {
    private String text;
    private long id;

    @Override
    public String toString() {
        return "UserTwo{" +
                "text='" + text + '\'' +
                ", id=" + id +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
