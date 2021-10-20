package bank;

public class CuentaBancaria {
    private String name;
    private int key;
    private float saldo;

    public CuentaBancaria(String name, int key, float saldo){
        this.name = name;
        this.key = key;
        this.saldo = saldo;
    }

    //metodos get y set
    //metodos set
    public String getMostrarName(){
        return this.name;
    }
    public int getMostrarKey(){
        return this.key;
    }
    public float getMostrarSaldo(){
        return this.saldo;
    }
    //metodos get
    public void setName(String name){
        this.name = name;
    }
    public void setKey(int key){
        this.key = key;
    }
    public void setSaldo(float saldo){
        if (saldo < 0){
            this.saldo = 0;
        }else {
            this.saldo = saldo;
        }
    }
}
