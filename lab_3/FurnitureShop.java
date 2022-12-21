package ru.maksim.ikbo2021.labs.lab_3;


public class FurnitureShop {
    private Furniture[] goods;

    public FurnitureShop(int count) {
        goods = new Furniture[count];
        for (int i = 0; i < count; ) {
            goods[i++] = new Chair(2500, 1.7, 0.4, 0.4, "Red", 13422, "cloth", true);
            if(i >= count) break;
            if (i >= count)break;
            goods[i++] = new Bed(19900, 0.8, 2, 3, "Dark brown", 35642,
                    2, 120, "Овечья шерсть");
        }
    }

    public Furniture[] getGoods() {
        return goods;
    }

    public void add(Furniture f){
        Furniture[] tmp = new Furniture[goods.length+1];
        System.arraycopy(goods, 0, tmp, 0, goods.length);
        tmp[goods.length] = f;
        goods = tmp;
    }

    public Furniture buy(int number){
        Furniture f = goods[number];
        Furniture[] tmp = new Furniture[goods.length-1];
        for (int i = 0; i < goods.length; i++){
            if(i < number) tmp[i] = goods[i];
            if (i > number) tmp[i-1] = goods[i];
        }
        goods = tmp;
        return f;
    }

    public String getPrices(){
        String res = "Магазин продаёт следующие товары:\n\n";
        for (Furniture f : goods) {
            res += f.toString() + "\n";
        }

        return res;
    }
}