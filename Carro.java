public class Carro implements Veiculo{
    private String modelo;
    private int velocidade;

    public Carro(String modelo){
        this.modelo = modelo;
    this.velocidade = 0;
    }

    public void acelerar () {
        velocidade += 10;
        System.out.println(modelo+"acelerou. velocidade atual :"+ velocidade +"km/h");
    }

    public void frear (){
        if (velocidade >=10){
            velocidade -=10;
        } else {
            velocidade = 0;
        }
        System.out.println(modelo + "freou, velocidade atual: "+ velocidade + " km/h");
    }
}