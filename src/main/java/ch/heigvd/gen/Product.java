package ch.heigvd.gen;

public class Product {
    private String code;
    private Color color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, Color color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    String getSizeFor() {
        return size.toString();
    }

    String getColorFor() {
        if(color != null){
            return color.toString();
        }else{
            return "no color";
        }
    }

    public StringBuffer toJSONString() {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(this.getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(this.getColorFor());
        sb.append("\", ");

        if (this.getSize() != Size.NO_SIZE) {
            sb.append("\"size\": \"");
            sb.append(this.getSizeFor());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(this.getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(this.getCurrency());
        sb.append("\"}, ");
        return sb;
    }
}