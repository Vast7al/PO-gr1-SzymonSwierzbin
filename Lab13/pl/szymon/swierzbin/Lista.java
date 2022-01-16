package pl.szymon.swierzbin;

import java.util.*;

public class Lista {
    public Lista() {
        this.list = new PriorityQueue<>();
        this.pisz();
    }

    public void pisz() {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] Word;
        Iterator<String> it;
        while (!line.equals("Zakończ")) {
            Word = line.split(" ");
            it = Arrays.stream(Word).iterator();
            if (it.hasNext()) {
                it.next();
                if (Word[0].equals("Dodaj") || Word[0].equals("dodaj")) {
                    System.out.println("Dodano polecenie");
                    int prio = 0;
                    StringBuffer opis = new StringBuffer();
                    if (it.hasNext()) {
                        prio = Integer.parseInt(it.next());
                    }
                    while (it.hasNext()) {
                        opis.append(it.next());
                        opis.append(" ");
                    }
                    list.add(new Task(prio, opis.toString()));
                } else if (Word[0].equals("Nastepne") || Word[0].equals("nastepne")) {
                    list.remove();
                    System.out.println("Polecenie usunięto");
                } else {
                    System.out.println("Polecenie nie zostało rozpoznane");
                }
            }
            line = scan.nextLine();

        }
    }

    public void wypisz() {
        PriorityQueue<Task> copiedList = new PriorityQueue<>(this.list);
        while (!copiedList.isEmpty()) {
            Task e = copiedList.remove();
            System.out.println("Opis--> " + e.opis);
            System.out.println("Priorytet--> " + e.priority);
        }
    }

    private PriorityQueue<Task> list;
}

class Task implements Comparable<Task> {
    int priority;
    String opis;

    public Task(int priority, String opis) {
        this.opis = opis;
        this.priority = priority;
    }

    public int compareTo(Task o) {
        return Integer.compare(this.priority, o.priority);
    }
}