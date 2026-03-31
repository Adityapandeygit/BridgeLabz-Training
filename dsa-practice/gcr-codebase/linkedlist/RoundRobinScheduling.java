package dsa_practice.gcr_codebase.linkedlist;
class ProcessNode {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;

    ProcessNode next;

    ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
class RoundRobinScheduler {
     ProcessNode head = null;
     int totalProcesses = 0;
     int totalWaitingTime = 0;
     int totalTurnAroundTime = 0;

    public void addProcess(int id, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(id, burstTime, priority);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            ProcessNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        totalProcesses++;
    }

    private void removeProcess(ProcessNode prev, ProcessNode curr) {
        if (curr == head && curr.next == head) {
            head = null;
        }
        else if (curr == head) {
            prev = head;
            while (prev.next != head) {
                prev = prev.next;
            }
            head = head.next;
            prev.next = head;
        }
        else {
            prev.next = curr.next;
        }
    }

    public void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }
        int currentTime = 0;
        ProcessNode current = head;
        ProcessNode previous = null;
        while (head != null) {
            System.out.println("\nExecuting Process ID: " + current.processId);
            if (current.remainingTime > timeQuantum) {
                current.remainingTime -= timeQuantum;
                currentTime += timeQuantum;
            } else {
                currentTime += current.remainingTime;
                current.remainingTime = 0;

                int turnAroundTime = currentTime;
                int waitingTime = turnAroundTime - current.burstTime;
                totalTurnAroundTime += turnAroundTime;
                totalWaitingTime += waitingTime;

                System.out.println("Process " + current.processId + " completed");

                removeProcess(previous, current);

                if (previous == null) {
                    current = head;
                } else {
                    current = previous.next;
                }

                displayProcesses();
                continue;
            }

            previous = current;
            current = current.next;
            displayProcesses();
        }

        displayAverages();
    }

    // 4️⃣ Display processes
    public void displayProcesses() {

        if (head == null) {
            System.out.println("No remaining processes");
            return;
        }

        ProcessNode temp = head;
        System.out.print("Queue: ");

        do {
            System.out.print("P" + temp.processId +
                    "(RT:" + temp.remainingTime + ")  ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    private void displayAverages() {

        double avgWaitingTime =
                (double) totalWaitingTime / totalProcesses;

        double avgTurnAroundTime =
                (double) totalTurnAroundTime / totalProcesses;

        System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turn Around Time: " + avgTurnAroundTime);
    }
}
public class RoundRobinScheduling {
	public static void main(String[] args) {

        RoundRobinScheduler rr = new RoundRobinScheduler();

        rr.addProcess(1, 10, 1);
        rr.addProcess(2, 5, 2);
        rr.addProcess(3, 8, 1);

        int timeQuantum = 3;

        rr.simulate(timeQuantum);
    }
}
