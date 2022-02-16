public class vezerlo {
    public vezerlo() {
        int[] tomb = {1, 2, 4, 5, 43, 6, 8, 10};
        int eredmeny;

        eredmeny = osszegzesTetele(tomb);
        eredmeny = megszamlalasTetele(tomb);


    }




    public int megszamlalasTetele(int[] tomb) {
        int vissza = 0;
        for (int Item: tomb) {
            if (Item > 5){
                vissza++;
            }
        }

        return vissza;
    }

    public int osszegzesTetele(int[] tomb) {
        int vissza = 0;
        for (int Item: tomb) {
            vissza += Item;
        }
        return vissza;
    }
}
