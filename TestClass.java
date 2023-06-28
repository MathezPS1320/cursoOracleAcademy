public class TestClass {
    public static void main(String[] args) {
        ComputeMethods computeMethods = new ComputeMethods();
        
        double temperaturaEmCelsius = 100.4;
        double temperaturaEmCelsius = computeMethods.fahrenheitParaCelsius(temperaturaEmCelsius);
        System.out.println("Temperatura total em Celsius é " + temperaturaEmCelsius);
        
        double ladoA = 10.816651099183552, ladoB = 0.006999999999999999;

        double hipotenusa = computeMethods.hipotenusa(ladoA, ladoB);
        System.out.println("O Valor da Hipotenusa é " + hipotenusa);
        
        int somaTotalDosDados = computeMethods.mexerDados();
        System.out.println("A soma dos valores informados são " + somaTotalDosDados);
    }
}

