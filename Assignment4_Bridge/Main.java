public class Bridge {
    //Abstract product
    public static abstract class Heart {
        protected HeartAction action;

        public Heart(HeartAction action) {
            this.action = action;
        }
        public abstract void work();
    }
    //Concrete product
    public static class HumanHeart extends Heart {
        public HumanHeart(HeartAction action) {
            super(action);
        }
        @Override
        public void work() {
            action.beat();
            action.pulse();
        }
    }
    //Abstract Bridge
    public static abstract interface HeartAction {
        void beat();
        void pulse();
    }
    //Concrete Bridge
    public static class FastAction implements HeartAction {
        @Override
        public void beat() {
        }
        @Override
        public void pulse() {
        }
    }
    //Client
    public static void main(String[] poop) {
        Heart heart = new HumanHeart(new FastAction());
        heart.work();
    }
}
