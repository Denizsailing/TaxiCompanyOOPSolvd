package org.example.ConnectionPool;
import java.util.concurrent.BlockingQueue;


import java.util.concurrent.LinkedBlockingQueue;

class ConnectionPool {
    private final BlockingQueue<Connection> pool;
    private static final int MAX_POOL_SIZE = 5;

    private ConnectionPool() {
        pool = new LinkedBlockingQueue<>(MAX_POOL_SIZE);
        initializePool();
    }

    private void initializePool() {
        for (int i = 0; i < MAX_POOL_SIZE; i++) {
            pool.add(new Connection());
        }
    }

    public Connection getConnection() throws InterruptedException {
        return pool.take();
    }

    public void releaseConnection(Connection connection) {
        pool.offer(connection);
    }

    public static ConnectionPool getInstance() {
        return ConnectionPoolHolder.INSTANCE;
    }

    private static class ConnectionPoolHolder {
        private static final ConnectionPool INSTANCE = new ConnectionPool();
    }
}
