public class BouncingBall {
     
    public static int bouncingBall(double h, double bounce, double window) {
        Boolean cond = h > 0 && (bounce > 0 && bounce < 1) && window < h;
        if (cond) {
            return h < window ? -1 : 2 + bouncingBall((h * bounce), bounce, window);
        }
        return -1;
    }
}