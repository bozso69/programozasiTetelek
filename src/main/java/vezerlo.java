public class vezerlo {
    public vezerlo() {
        int[] tomb = {1, 2, 4, 5, 43, 6, 8, 10};
        int[] tomb1 = {1, 20, 40, 5, 43, 6, 80, 10};
        int[] visszTomb = new int[tomb.length];
        int[] visszaUnio = new int[tomb.length + tomb1.length];
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
        visszTomb = metszetTetele(tomb,tomb1);
        visszaUnio = unioTetele(tomb,tomb1);
    }

    public int[] unioTetele(int[] tomb, int[] tomb1) {
        int[] vissza = new int[tomb.length+tomb1.length];
        int j=0;
        int k;
        for (int Item: tomb) {
            vissza[j++] = Item;
        }
        for (int Item:tomb1) {
            k=0;
            while (k<tomb.length && tomb[k] != Item){
                k++;
            }
            if (k==tomb.length){
                vissza[j++]=Item;
            }
            //System.out.print("k: "+k + " ");
        }

        System.out.println();
        for (int Item:vissza) {

            System.out.print(Item+ ", ");
        }
    return vissza;}

    public int[] metszetTetele(int[] tomb, int[] tomb1) {
        int[] visszTomb = new int[tomb.length];
        int j =0;
        for (int ItemTomb: tomb) {
            for (int ItemTomb1 : tomb1) {
                if (ItemTomb == ItemTomb1){
                    visszTomb[j++] = ItemTomb;
                }

            }
        }
        return visszTomb;}

    public int minimumTetel(int[] tomb) {
        int j=tomb[0];
        for (int Item: tomb) {
            if (j> Item){
                j=Item;
            }
        }
        return j;
    }

    public int maximumTetel(int[] tomb) {
        int j=tomb[0];
        for (int Item: tomb) {
            if (j< Item){

                j=Item;
            }
        }

        return j;
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
