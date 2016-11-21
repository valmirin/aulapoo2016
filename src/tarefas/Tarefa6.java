package tarefas;

/**
 *
 * @author Renata
 */
public class Tarefa6  implements Runnable {

    @Override
    public void run() {
        for (int i = 50000; i <= 60000; i++) {
            if (i % 2 != 0 & i % 3 != 0) {
                System.out.println("Thread 6 - O número " + i + " é primo!");
            } else if (i == 2 ^ i == 3) {
                System.out.println("Thread 6 - O número " + i + " é primo!");
            }
        }
    }

}
