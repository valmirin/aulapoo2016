package tarefas;

/**
 *
 * @author Renata
 */
public class Tarefa5  implements Runnable {

    @Override
    public void run() {
        for (int i = 40000; i <= 50000; i++) {
            if (i % 2 != 0 & i % 3 != 0) {
                System.out.println("Thread 5 - O número " + i + " é primo!");
            } else if (i == 2 ^ i == 3) {
                System.out.println("Thread 5 - O número " + i + " é primo!");
            }
        }
    }

}
