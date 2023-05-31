public class replit148 {

        public static void main(String[] args) {
            ShoppingStore totalvalue = new ShoppingStore("Blanket", 99.98, 1);
            System.out.println(totalvalue.item + " " + "Total value" + " " + totalvalue.itemTotalPrice());

            ShoppingStore totalvalue1 = new ShoppingStore("Mattress", 439.18, 1);
            System.out.println(totalvalue1.item + " " + "Total value" + " " + totalvalue1.itemTotalPrice());

            // ShoppingStore totalvalue2 = new ShoppingStore("You purchased", ((totalvalue.price+totalvalue1.price)), "Today") ;
            // System.out.println(totalvalue.price+totalvalue1.price);
            System.out.println("You purchased " + (totalvalue.itemTotalPrice() + totalvalue1.itemTotalPrice()) + " Today");

        }
    }


    class ShoppingStore {

        String item;
        double price;
        int quantity;


        ShoppingStore(String item, double price, int quantity) {
            this.item = item;
            this.price = price;
            this.quantity = quantity;
        }


        double itemTotalPrice() {
            double value = (price * quantity);
            return value;
        }


    }
