public class MobilListrik extends Mobil {
    private int lamaRecharge;

    public MobilListrik(String pabrikan, String model, String warna, int kecepatanMax, int lamaRecharge) {
        setPabrikan(pabrikan);
        setModel(model);
        setWarna(warna);
        setKecepatanMax(kecepatanMax);
        this.lamaRecharge = lamaRecharge;
    }

    public MobilListrik() {
       
    }

    public void setLamaRecharge(int lamaRecharge) {
        this.lamaRecharge = lamaRecharge;
    }

    public int getLamaRecharge() {
        return lamaRecharge;
    }
}
