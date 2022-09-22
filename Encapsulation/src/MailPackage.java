public class MailPackage {

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getAdress() {
        return adress;
    }

    public boolean isCanFlip() {
        return isCanFlip;
    }

    public int getNumber() {
        return number;
    }

    public boolean isFragile() {
        return isFragile;
    }

    private final Dimensions dimensions;
    private final int weight;
    private final String adress;
    private final boolean isCanFlip;
    private final int number;
    private final boolean isFragile;


    public MailPackage(int width, int height, int length, int weight, String adress, boolean isCanFlip, int number, boolean isFragile) {
        this.dimensions = new Dimensions(width,height, length);
        this.weight = weight;
        this.adress = adress;
        this.isCanFlip = isCanFlip;
        this.number = number;
        this.isFragile = isFragile;
    }

    public MailPackage(Dimensions dimensions, int weight, String adress, boolean isCanFlip, int number, boolean isFragile) {
        this.dimensions = new Dimensions(dimensions.getWidth(),dimensions.getHeight(), dimensions.getLength());
        this.weight = weight;
        this.adress = adress;
        this.isCanFlip = isCanFlip;
        this.number = number;
        this.isFragile = isFragile;
    }

    public MailPackage chengeDimensions(int width, int height, int length){
        return new MailPackage(width,  height,  length,  weight,  adress,  isCanFlip,  number,  isFragile);
    }

    public MailPackage chengeAdress(String adress){
        return new MailPackage(dimensions,  weight,  adress,  isCanFlip,  number,  isFragile);
    }

    public MailPackage chengeWeight(int weight){
        return new MailPackage(dimensions,  weight,  adress,  isCanFlip,  number,  isFragile);
    }
    public MailPackage copy(){
        return new MailPackage(getDimensions(),
                getWeight(),
                getAdress(),
                isCanFlip(),
                getNumber(),
                isFragile());
    }

    @Override
    public String toString(){
        String out = "Габариты:\n"+
                "  Ширина: "+ this.dimensions.getHeight()+"\n"+
                "  Высота: "+ this.dimensions.getWidth()+"\n"+
                "  Длинна: "+ this.dimensions.getLength()+"\n"+
                "Вес: "+ getWeight()+"\n"+
                "Адрес: "+ getAdress()+"\n"+
                "Можно переворачивать: "+ isCanFlip()+"\n"+
                "Номер: "+ getNumber()+"\n"+
                "Хрупкий: "+ isFragile()+"\n";
        return out;
    }

}
