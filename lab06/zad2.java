public class zad2 {
    public static void main(String[] args) {
        IntegerSet zbior = new IntegerSet();
        zbior.insertElement(4);
        zbior.insertElement(5);
        zbior.insertElement(6);
        zbior.deleteElement(4);
        IntegerSet zbior2 = new IntegerSet();
        zbior.insertElement(7);
        zbior.insertElement(8);
        System.out.println(zbior);
        System.out.println(zbior.union(zbior, zbior2));
    }
}

class IntegerSet {
    private final boolean[] zbior;

    public IntegerSet() {
        this.zbior = new boolean[100];
    }

    public IntegerSet union(IntegerSet a, IntegerSet b) {
        IntegerSet n_zbior = new IntegerSet();
        for (int i = 0; i < 100; i++) {
            if (a.zbior[i] || b.zbior[i])
                n_zbior.zbior[i] = true;
        }
        return n_zbior;
    }

    public static IntegerSet intersection(IntegerSet a, IntegerSet b) {
        IntegerSet n_zbior = new IntegerSet();
        for (int i = 0; i < 100; i++) {
            if (a.zbior[i] && b.zbior[i])
                n_zbior.zbior[i] = true;
        }
        return n_zbior;
    }

    public void insertElement(int i) {
        this.zbior[i - 1] = true;
    }

    public void deleteElement(int i) {
        this.zbior[i - 1] = false;
    }

    public String toString() {
        StringBuilder liczby = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            if (this.zbior[i]) {
                liczby.append(i + 1);
                liczby.append(" ");
            }
        }
        return liczby.toString();
    }

    public boolean equals(IntegerSet b) {
        return this.toString().equals(b.toString());
    }
}
