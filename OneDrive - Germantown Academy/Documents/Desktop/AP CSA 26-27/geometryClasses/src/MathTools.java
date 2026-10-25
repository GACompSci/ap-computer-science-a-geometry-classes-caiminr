public class MathTools {
    
        public static int randInt(int min, int max){
            return (int)(Math.random() * (max - min + 1)) + min;
        
        }

        public static double round(double num, int places){
            num *= Math.pow(10,places);
            int rounded = (int)(num + 0.5);
            return rounded / Math.pow(10,places);
        }
        


        public static double distance(Point a, Point b){
           return Math.sqrt(Math.pow((b.getX() - a.getX()),2) + Math.pow((b.getY()-a.getY()),2));

        }
        
        public static double slope(Point a, Point b){
            return (b.getY() - a.getY())/(b.getX() - a.getX());

        }

}


