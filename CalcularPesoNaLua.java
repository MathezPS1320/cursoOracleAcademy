public class CalcularPesoNaLua {

    public double calcularPesoNaLua(double peso) {
        double gravidadeLuaBranca = 1.62;
        return  gravidadeLuaBranca * (peso / 9.807);
    }

}
