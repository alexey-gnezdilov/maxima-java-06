package org.example.model.transport;

public interface Repairable {
    void startRepair();
    void finishRepair();
    boolean isRepairing();
}
