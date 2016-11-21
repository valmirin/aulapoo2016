package tarefas;

/**
 *
 * @author Renata
 */
public class Tarefa9  implements Runnable {

    @Override
    public void run() {
        for (int i = 80000; i <= 90000; i++) {
            if (i % 2 != 0 & i % 3 != 0) {
                System.out.println("Thread 9 - O número " + i + " é primo!");
            } else if (i == 2 ^ i == 3) {
                System.out.println("Thread 9 - O número " + i + " é primo!");
            }
        }
    }

}
