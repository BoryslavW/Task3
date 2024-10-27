public class methods {
    public class solve {}
    private double slope;


    public int returnX (String coor) {
        String fHalf = coor.substring(1, coor.indexOf(",")-1);


        return Integer.parseInt(fHalf);
    }


    public int returnY (String coor) {
        String sHalf = coor.substring(coor.indexOf(",") + 2);


        return Integer.parseInt(sHalf);
    }


    public String doSlope(int fx, int fy, int sx, int sy ) {   //f for first, s for second
        int xChange = sx - fx;
        int yChange = sy - fy;

        slope = (double) xChange /yChange;


        return xChange + "/" + yChange;
    }

    public int yIntercept(String first) {
        double initialX = returnX(first);
        double initialY = returnY(first);

        if (initialX > 0)  {-
            int changingX;
            int changingY;



        }

        return
    }




}
