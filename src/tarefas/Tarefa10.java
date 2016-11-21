package tarefas;

/**
 *
 * @author Renata
 */
public class Tarefa10  implements Runnable {

    @Override
    public void run() {
        for (int i = 90000; i <= 99999; i++) {
            if (i % 2 != 0 & i % 3 != 0) {
                System.out.println("Thread 10 - O número " + i + " é primo!");
            } else if (i == 2 ^ i == 3) {
                System.out.println("Thread 10 - O número " + i + " é primo!");
            }
        }
    }

}
