package baseCourse.exercises.module02;

import baseCourse.exercises.module01.l01Device;

public class l02Storage {
    l01Device deviceType;
    String storageSector;
    int devicesQuantity;
    double storageEnergyConsumption;
    boolean isStorageActive;

    public int insertDeviceOnStorage(int devicesToStore){
        devicesQuantity += devicesToStore;
        return devicesQuantity;
    }

    public int takeDeviceFromStorage(int devicesTaken){
        devicesQuantity -= devicesTaken;
        return devicesQuantity;
    }

    public static class l03BurgerShopCart {
        private String mainChoice;
        private float mainChoicePrice;
        private String extraChoice01;
        private float extraChoice01Price;
        private String extraChoice02;
        private float extraChoice02Price;
        private String drinkChoice;
        private float drinkChoicePrice;
        private String comboName;
        private float comboPrice;
        private float totalBuyValue;
        private boolean isFamilyCombo;

        public void makeCombo01(){
            comboName = "Cheese combo";
            mainChoice = "Cheeseburger";
            mainChoicePrice = 15.99f;
            extraChoice01 = "Fries";
            extraChoice01Price = 6.99f;
            extraChoice02 = "Extra cheese";
            extraChoice02Price = 0.99f;
            drinkChoice = "Pepsi cola can";
            drinkChoicePrice = 0.49f;
            comboPrice += mainChoicePrice + extraChoice01Price
                    + extraChoice02Price + drinkChoicePrice;
            totalBuyValue += comboPrice;
        }

        public void calculateCombo01Discount(){
            comboPrice -= comboPrice * 0.10;
        }

        public void makeCombo02(){
            comboName = "Super bacon combo";
            mainChoice = "Cheesebacon burger";
            mainChoicePrice = 17.99f;
            extraChoice01 = "Extra bacon";
            extraChoice01Price = 2.99f;
            extraChoice02 = "Extra tomato and catupiry";
            extraChoice02Price = 2.49f;
            drinkChoice = "Lemon juice";
            drinkChoicePrice = 1.99f;
            comboPrice += mainChoicePrice + extraChoice01Price
                    + extraChoice02Price + drinkChoicePrice;
            totalBuyValue += comboPrice;
        }

        public void calculateCombo02Discount(){
            comboPrice -= comboPrice * 0.20;
        }

        public void showTotalBuyValue(){
            System.out.println("Total buy value = " + totalBuyValue);
        }

        public void makeFamilyComboA(){
            isFamilyCombo = true;
            System.out.println("=== Family combos ===");
            System.out.println("Included combos = ");
            System.out.println(comboName);
        }

        public void calculateFamilyComboDiscount(){
            if (isFamilyCombo == true){
                totalBuyValue -= totalBuyValue * 0.10;
            }
        }
    }
}
