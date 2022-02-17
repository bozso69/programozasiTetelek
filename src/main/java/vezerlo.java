public class vezerlo {
    public vezerlo() {
        int[] tomb = {1, 2, 4, 5, 43, 6, 8, 10};
        int eredmeny;
        boolean isEredmeny;

        eredmeny = osszegzesTetele(tomb);
        eredmeny = megszamlalasTetele(tomb);
        isEredmeny = eldontestetele(tomb, 5);
        eredmeny = kivalasztasTetele(tomb, 5);
        isEredmeny = keresesTetele(tomb, 5);


    }

    public boolean keresesTetele(int[] tomb, int szam) {
        int j = 0;
        while (j < tomb.length && tomb[j] !=  szam){
            j++;
        }
        if (j< tomb.length){
            return true;
        }else return false;
    }

    public int kivalasztasTetele(int[] tomb, int szam) {

        int j = 0;
        while (j < tomb.length && szam != tomb[j]){
                j++;
        }
            if (j<tomb.length){

                System.out.println("vezerlo.kivalasztasTetele");
                return j+1;
            }else {
                return  0;
            }



    }


    public boolean eldontestetele(int[] tomb, int szam) {
        int j = 0;
        while (j < tomb.length && tomb[j] != szam) {
            j++;
        }
        if (j < tomb.length) {
            return true;
        } else return false;

    }


    public int megszamlalasTetele(int[] tomb) {
        int vissza = 0;
        for (int Item : tomb) {
            if (Item > 5) {
                vissza++;
            }
        }

        return vissza;
    }

    public int osszegzesTetele(int[] tomb) {
        int vissza = 0;
        for (int Item : tomb) {
            vissza += Item;
        }
        return vissza;
    }
}
