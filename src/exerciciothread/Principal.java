package exerciciothread;

import tarefas.Tarefa1;
import tarefas.Tarefa10;
import tarefas.Tarefa2;
import tarefas.Tarefa3;
import tarefas.Tarefa4;
import tarefas.Tarefa5;
import tarefas.Tarefa6;
import tarefas.Tarefa7;
import tarefas.Tarefa8;
import tarefas.Tarefa9;

/**
 *
 * @author Renata
 */
public class Principal {

    public static void main(String[] args) {
        Tarefa1 tarefa1 = new Tarefa1();
        Tarefa2 tarefa2 = new Tarefa2();
        Tarefa3 tarefa3 = new Tarefa3();
        Tarefa4 tarefa4 = new Tarefa4();
        Tarefa5 tarefa5 = new Tarefa5();
        Tarefa6 tarefa6 = new Tarefa6();
        Tarefa7 tarefa7 = new Tarefa7();
        Tarefa8 tarefa8 = new Tarefa8();
        Tarefa9 tarefa9 = new Tarefa9();
        Tarefa10 tarefa10 = new Tarefa10();
        
        Thread thread1 = new Thread(tarefa1);
        Thread thread2 = new Thread(tarefa2);
        Thread thread3 = new Thread(tarefa3);
        Thread thread4 = new Thread(tarefa4);
        Thread thread5 = new Thread(tarefa5);
        Thread thread6 = new Thread(tarefa6);
        Thread thread7 = new Thread(tarefa7);
        Thread thread8 = new Thread(tarefa8);
        Thread thread9 = new Thread(tarefa9);
        Thread thread10 = new Thread(tarefa10);
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }

}
