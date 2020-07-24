package io.pivotal.pcf.demo.fortunebackend;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;


/**
 * Created by azwickey on 1/12/18.
 */
@RedisHash("fortune")
public class Fortune {

    @Id private Long id;
    private String text;

    public Fortune() {  }

    public Fortune(String text) {
        this.text = text;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return getId() + ", " + getText();
    }
}
