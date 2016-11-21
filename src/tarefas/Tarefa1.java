package tarefas;

/**
 *
 * @author Renata
 */
public class Tarefa1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            if (i % 2 != 0 & i % 3 != 0) {
                System.out.println("Thread 1 - O número " + i + " é primo!");
            } else if (i == 2 ^ i == 3) {
                System.out.println("Thread 1 - O número " + i + " é primo!");
            }
        }
    }

}
