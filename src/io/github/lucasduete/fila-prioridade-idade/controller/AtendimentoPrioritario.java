package io.github.lucasduete.filasBanco.controller;

import io.github.lucasduete.filasBanco.model.Pessoa;

import java.util.PriorityQueue;
import java.util.Queue;

public class AtendimentoPrioritario {

    public static void main(String[] args) {

        Queue<Pessoa> filaBanco = new PriorityQueue<>();

        Pessoa a = new Pessoa("nome1", "1", 1, 25);
        Pessoa b = new Pessoa("nome6", "2", 1, 45);
        Pessoa c = new Pessoa("nome5", "3", 1, 19);
        Pessoa d = new Pessoa("nome4", "4", 1, 80);
        Pessoa e = new Pessoa("nome3", "5", 1, 18);
        Pessoa f = new Pessoa("nome2", "6", 1, 60);


        filaBanco.offer(a);
        filaBanco.offer(b);
        filaBanco.offer(c);
        filaBanco.offer(d);
        filaBanco.offer(e);
        filaBanco.offer(f);


        System.out.printf("\n\nIMPRIMINDO TOPO\n\n");
        System.out.println(filaBanco.peek());

        Queue<Pessoa> fila2 = filaBanco;

        fila2.poll();
        System.out.println(fila2.peek());

        System.out.printf("\n\nIMPRIMINDO FILA\n\n");
        for (int aux = 0; aux < 6; ++aux) {
            System.out.println(filaBanco.poll());
        }

    }
}
