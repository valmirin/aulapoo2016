package tarefas;

/**
 *
 * @author Renata
 */
public class Tarefa8  implements Runnable {

    @Override
    public void run() {
        for (int i = 70000; i <= 80000; i++) {
            if (i % 2 != 0 & i % 3 != 0) {
                System.out.println("Thread 8 - O número " + i + " é primo!");
            } else if (i == 2 ^ i == 3) {
                System.out.println("Thread 8 - O número " + i + " é primo!");
            }
        }
    }

}
