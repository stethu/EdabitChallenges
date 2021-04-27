public class Main {
    public static void main(String[] args) {
        System.out.println(OneTimePadTraining.encrypt("24955184247696969", "637197877682780836504704874690100607768768"));
        System.out.println(OneTimePadTraining.decrypt("6371956289367449331922", "637197877682780836504704874690100607768768"));
        System.out.println(OneTimePadTraining.decrypt("6371956289367449331922", "442878365779404250678127528855846163827272"));
    }
}
