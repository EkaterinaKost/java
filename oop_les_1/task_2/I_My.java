package oop_les_1.task_2;

public interface I_My {
    int getUserID();

    default int getAdminID() {
        return 1;
    }
}
