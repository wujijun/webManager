package pojo;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private  String password;
    private  String email;
    private  String img;

    public User() {
    }

    public User(int id, String name, String password, String email, String img) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.img = img;
    }
}
