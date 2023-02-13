public class MercadoFacade {
    private MercadoApp mercadoapp;
    private Armazem armazem;
    private MercadoEntrega mercadoEntrega;

    public MercadoFacade() {
    }

    public MercadoFacade(MercadoApp mercadoapp,
                         Armazem armazem,
                         MercadoEntrega mercadoEntrega) {
        this.mercadoapp = mercadoapp;
        this.armazem = armazem;
        this.mercadoEntrega = mercadoEntrega;
    }
    public void compraCliente() {
        mercadoapp.inicioCompra();
        mercadoapp.escolhoDosProdutoS();
        mercadoapp.finalizoCompra();
        armazem.procuraDeItem(15);
        armazem.liberandoOItem();
        mercadoEntrega.pegoOsProdutos(15,"11 Pães, Suco, Ketchup, saco de salsicha");
        mercadoapp.esperaDaEntrega();
        mercadoEntrega.entregaCliente();
        mercadoapp.entregue();
    }
}
