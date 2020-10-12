import java.time.LocalDate;
import java.util.*;

public class Order {
    private int orderNum;
    private boolean status; //0 = pending, 1 = finished
    private LocalDate finalizationDate;

    public Order(int orderNum, boolean status, LocalDate finalizationDate) {
        this.orderNum = orderNum;
        this.status = status;
        this.finalizationDate = finalizationDate;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getFinalizationDate() {
        return finalizationDate;
    }

    public void setFinalizationDate(LocalDate finalizationDate) {
        this.finalizationDate = finalizationDate;
    }
}