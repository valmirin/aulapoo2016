package tarefas;

/**
 *
 * @author Renata
 */
public class Tarefa2  implements Runnable {

    @Override
    public void run() {
        for (int i = 10000; i <= 20000; i++) {
            if (i % 2 != 0 & i % 3 != 0) {
                System.out.println("Thread 2 - O número " + i + " é primo!");
            } else if (i == 2 ^ i == 3) {
                System.out.println("Thread 2 - O número " + i + " é primo!");
            }
        }
    }

}
