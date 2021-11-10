class Main {
    public static void main(String args[]) {
        SuaraBebek suaraBebek = new SuaraBebek();
        Kucing kucing = new SuaraKucing();

        Kucing BebekAdapter = new BebekAdapter(suaraBebek);

        System.out.print("Bebek Asli Mengeluarkan suara\t: ");
        suaraBebek.kwek();

        System.out.print("Kucing Asli Mengeluarkan suara\t: ");
        kucing.meow();

        System.out.print("Kucing Palsu mengeluarkan suara\t: ");
        BebekAdapter.meow();
    }
}