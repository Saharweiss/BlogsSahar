package il.co.sahar.view;

import java.io.Serializable;
import java.util.Objects;

public class BaseEntity implements Serializable {
    private String idFs;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(idFs, that.idFs);
    }
    public String getIdFs() {
        return idFs;
    }

    public void setIdFs(String idFs) {
        this.idFs = idFs;
    }

    public BaseEntity(String idFs) {
        this.idFs = idFs;
    }
}
