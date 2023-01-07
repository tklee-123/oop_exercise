package week05.exercise1_5;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getID() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return this.unitPrice * this.qty;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("InvoiceItem")
                .append("[")
                .append("id = ")
                .append(this.id)
                .append(", ")
                .append("desc = ")
                .append(this.desc)
                .append(", ")
                .append("qty = ")
                .append(qty)
                .append(", ")
                .append("unitPrice = ")
                .append(unitPrice)
                .append("]");
        return description.toString();
    }
}
