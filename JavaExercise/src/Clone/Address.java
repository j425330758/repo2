package Clone;

import java.io.Serializable;

public class Address implements Serializable {
    private String add;

    public Address() {
    }

    public Address(String add) {
        this.add = add;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
