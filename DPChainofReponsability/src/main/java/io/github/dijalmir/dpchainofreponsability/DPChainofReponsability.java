/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package io.github.dijalmir.dpchainofreponsability;

/**
 *
 * @author junio
 */
public class DPChainofReponsability {

    public static void main(String[] args) {
        // Criação dos manipuladores
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        // Configuração da cadeia de responsabilidade
        handler1.setNext(handler2);
        handler2.setNext(handler3);

        // Criação das solicitações
        Request request1 = new Request("Tipo1", "Descrição da solicitação 1");
        Request request2 = new Request("Tipo2", "Descrição da solicitação 2");
        Request request3 = new Request("Tipo3", "Descrição da solicitação 3");

        // Manipulação das solicitações
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
    }
}
