package ru.maksim.ikbo2021.new_pracs.prac_13;

public class FourthTask {
    public FourthTask() {
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        FourthTask.Shirt[] arShirts = new FourthTask.Shirt[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black TShirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        for(int i = 0; i < shirts.length; ++i) {
            arShirts[i] = new FourthTask.Shirt(shirts[i]);
            System.out.println(arShirts[i]);
        }

    }

    static class Shirt {
        String stArticle = "";
        String stModel = "";
        String stColor = "";
        String stSize = "";

        public Shirt(String str) {
            String[] all = str.split(",");

            for(int i = 0; i < all.length; ++i) {
                if (this.stArticle.isEmpty()) {
                    this.stArticle = all[i];
                } else if (this.stModel.isEmpty()) {
                    this.stModel = all[i];
                } else if (this.stColor.isEmpty()) {
                    this.stColor = all[i];
                } else if (this.stSize.isEmpty()) {
                    this.stSize = all[i];
                }
            }

        }

        public String toString() {
            return "Article: " + this.stArticle + " Model: " + this.stModel + " Color: " + this.stColor + " Size: " + this.stSize;
        }
    }
}
