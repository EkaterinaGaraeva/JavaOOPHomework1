package ru.geekbrains.sm1;

public class Engine {
    private Boolean work;

    public void start() {
        this.work = true;
        System.out.println("Engine started");
    }

    public void stop() {
        this.work = false;
        System.out.println("Engine stopped");
    }

    public void throttleUp(int level) {
        if (this.work) {
            System.out.printf("Throttle open on %d%n", level);
        }
    }

    public Boolean getWork() {
        return work;
    }
}
