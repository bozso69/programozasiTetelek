public class vezerlo {
    public vezerlo() {
        int[] tomb = {1, 2, 4, 5, 43, 6, 8, 10};
        int[] visszTomb = new int[tomb.length];
        int eredmeny;
        boolean isEredmeny;

        eredmeny = osszegzesTetele(tomb);
        eredmeny = megszamlalasTetele(tomb);
        isEredmeny = eldontestetele(tomb, 5);
        eredmeny = kivalasztasTetele(tomb, 5);
        isEredmeny = keresesTetele(tomb, 5);
        visszTomb = kivalogatasTetele(tomb, 5);
        szetvalogatasTetele(tomb,5);
        eredmeny = maximumTetel(tomb);
        eredmeny = minimumTetel(tomb);



    }

    public int minimumTetel(int[] tomb) {
        return 0;
    }

    public int maximumTetel(int[] tomb) {
        return 0;
    }

    private void szetvalogatasTetele(int[] tomb, int szam) {

        int[] tomb1 = new int[tomb.length];
        int[] tomb2 = new int[tomb.length];
        int t1sz=0;
        int t2sz=0;

        for (int Item: tomb) {
            if (Item > szam){
                tomb1[t1sz++] = Item;
            }else tomb2[t2sz++] = Item;

        }
        System.out.println();
        System.out.print("Tömb: ");
        for (int Item: tomb) {
            System.out.print(Item+", ");
        }
        System.out.println();
        System.out.print("Tömb1: ");
        for (int i = 0; i < t1sz; i++) {
            System.out.print(tomb1[i] + ", ");
        }
        System.out.println();
        System.out.print("Tömb2: ");
        for (int i = 0; i < t2sz; i++) {
            System.out.print(tomb2[i]+", ");
        }
    }

    public int[] kivalogatasTetele(int[] tomb, int szam) {
        int j=0;
        int[] tombVissza = new int[tomb.length];
        for (int Item: tomb) {
            if (Item > szam){
                tombVissza[j++] = Item;
            }
        }
        return tombVissza;
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
