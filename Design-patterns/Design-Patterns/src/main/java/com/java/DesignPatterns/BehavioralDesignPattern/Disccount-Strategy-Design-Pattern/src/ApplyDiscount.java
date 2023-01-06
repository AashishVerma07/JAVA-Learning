public class ApplyDiscount {
    DiscountStrategy discountStrategy;

        public ApplyDiscount
        (DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
        }

        void getDiscount(){
        discountStrategy.giveDiscount();
        }

        void setStrategy(DiscountStrategy discountStrategy){
            this.discountStrategy = discountStrategy;
        }
}
