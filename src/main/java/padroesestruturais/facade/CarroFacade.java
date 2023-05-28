package padroesestruturais.facade;

class CarroFacade {
    private final Motor motor;
    private final SistemaEletrico sistemaEletrico;
    private final Freio freio;

    public CarroFacade() {
        motor = new Motor();
        sistemaEletrico = new SistemaEletrico();
        freio = new Freio();
    }

    public void ligarCarro() {
        motor.ligar();
        sistemaEletrico.ligarFarol();
    }

    public void desligarCarro() {
        freio.frear();
        sistemaEletrico.desligarFarol();
        sistemaEletrico.desligarSeta();
        motor.desligar();
    }
}.