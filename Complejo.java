public class Complejo {
    private double real;
    private double imaginario;

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    @Override
    public String toString() {
        String resultado="";
        if(imaginario>=0){
            return real+" + "+imaginario+"i";
        }else{
            return real+" - "+(-imaginario)+"i";
        }
    }

    public Complejo sumar(Complejo var2){
        double realtotal=real+ var2.real;
        double imag=imaginario+ var2.getImaginario();
        return new Complejo(realtotal,imag);
    }
}
