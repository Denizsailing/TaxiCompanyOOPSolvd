package org.example.ConnectionPool;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.CompletableFuture;




public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ConnectionPool connectionPool = ConnectionPool.getInstance();

        // Creating and starting 2 threads using Runnable and Thread
        Thread thread1 = new Thread(new MyRunnable("Thread 1", connectionPool));
        Thread thread2 = new Thread(new MyRunnable("Thread 2", connectionPool));
        thread1.start();
        thread2.start();

        // Creating a ThreadPoolExecutor  7 threads
        ExecutorService executorService = Executors.newFixedThreadPool(7);
        Future<Void>[] futures = new Future[5];

        for (int i = 0; i < 5; i++) {
            futures[i] = CompletableFuture.runAsync(() -> {
                try {
                    Connection connection = connectionPool.getConnection();
                    // Use connection for executing queries
                    Thread.sleep(1000); // Simulating query execution
                    connectionPool.releaseConnection(connection);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, executorService);
        }

        // Waiting for the tasks to complete
        for (Future<Void> future : futures) {
            future.get();
        }

        // Shutting down the executor service
        executorService.shutdown();
    }

    static class MyRunnable implements Runnable {
        private final String name;
        private final ConnectionPool connectionPool;

        public MyRunnable(String name, ConnectionPool connectionPool) {
            this.name = name;
            this.connectionPool = connectionPool;
        }

        @Override
        public void run() {
            try {
                Connection connection = connectionPool.getConnection();
                System.out.println("Thread " + name + " got the connection");
                // Use the connection
                Thread.sleep(2000); // Simulating work
                connectionPool.releaseConnection(connection);
                System.out.println("Thread " + name + " released the connection");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}