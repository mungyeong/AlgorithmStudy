package programmers;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
public class Problem42577 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<Integer> a = new HashSet<>();
        HashSet<String> b = new HashSet<>();

        for (String i : phone_book) {
            a.add(i.length());
            if (b.contains(i)) {
                answer = false;
                break;
            } else {
                b.add(i);
            }
        }

        LinkedList<Integer> a1 = new LinkedList<>(a);
        Collections.sort(a1);
        if (answer) {
            for (int i : a1) {
                HashSet<String> b1 = new HashSet<>(b);
                HashSet<String> c = new HashSet<>();
                HashSet<String> c1 = new HashSet<>();
                for (String i1 : b1) {
                    int pl = i1.length();
                    if (!(c.contains(i1)&&c1.contains(i1))) {
                        if (pl == i) {
                            c1.add(i1);
                            b.remove(i1);
                        } else if (pl > i) {
                            c.add(i1.substring(0, i));
                        } else {
                            b.remove(i1);
                        }
                    } else {
                        answer = false;
                        break;
                    }
                }
                if (answer) {
                    for (String i1 : c) {
                        if (c1.contains(i1)) {
                            answer = false;
                            break;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
