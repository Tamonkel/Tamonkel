public class PKW extends Vehicle {
    private int maxV; // 0 ≤ actV ≤ maxV

    public int getMaxVelocity() {
        return maxV;
    }

    public void print(int n) {
        super.print();
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }
}
