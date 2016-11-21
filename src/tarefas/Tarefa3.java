package tarefas;

/**
 *
 * @author Renata
 */
public class Tarefa3  implements Runnable {

    @Override
    public void run() {
        for (int i = 20000; i <= 30000; i++) {
            if (i % 2 != 0 & i % 3 != 0) {
                System.out.println("Thread 3 - O número " + i + " é primo!");
            } else if (i == 2 ^ i == 3) {
                System.out.println("Thread 3 - O número " + i + " é primo!");
            }
        }
    }

}
