package Cafenea;

public class Coffe {
    private String typeCoffe;
    private Integer price;
    private String typeEspresso;
    private boolean hasSugar;
    private boolean hasMilk;

    public String getTypeCoffe() {
        return typeCoffe;
    }

    public Integer getPrice() {
        return price;
    }

    public String getTypeEspresso() {
        return typeEspresso;
    }

    public boolean isHasSugar() {
        return hasSugar;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    private Coffe(UserBuilder builder)
    {
        this.typeCoffe= builder.typeCoffe;
        this.price=builder.price;
        this.typeEspresso=builder.typeEspresso;
        this.hasMilk=builder.hasMilk;
        this.hasSugar=builder.hasSugar;
    }

    @Override
    public String toString() {
        if(typeEspresso!=null)
        return "Cafea-" +
                "tip:'" + typeCoffe + '\'' +
                ", tipEspresso: '" + (typeEspresso) + '\'' +
                ", zahar:" + (hasSugar ? "da":"nu") +
                ", lapte:" + (hasMilk ? "da":"nu")+
                ", pret: " + price
                ;
        else
            return "Cafea-" +
                    "tip:'" + typeCoffe + '\'' +
                    ", zahar:" + (hasSugar ? "da":"nu") +
                    ", lapte:" + (hasMilk ? "da":"nu")+
                    ", pret:" + price ;
    }

    public static class UserBuilder {
        private  String typeCoffe;
        private  Integer price;
        private String typeEspresso;
        private boolean hasSugar;
        private boolean hasMilk;

        public UserBuilder(String typeCoffe,Integer price)
        {
            this.typeCoffe= typeCoffe;
            this.price=price;
        }

        public UserBuilder typeEspresso(String typeEspresso)
        {
            this.typeEspresso=typeEspresso;
            return this;
        }

        public UserBuilder hasSugar(boolean hasSugar)
        {
            this.hasSugar=hasSugar;
            return this;
        }

        public UserBuilder hasMilk(boolean hasMilk)
        {
            this.hasMilk=hasMilk;
            return this;
        }

        public Coffe build()
        {
            return new Coffe(this);
        }
    }
}
