class Main {}

class Student {
  // S, A, phi, s0
  final static int WAKEUP = 0;
  final static int EXCITED = 1;
  final static int DIZZY = 2;

  int current = WAKEUP; // s0 is WAKEUP

  void milk() {
    System.out.println("Drink milk");
    if (current == WAKEUP) {
      current = DIZZY;
      System.out.println("DIZZY");
    } else if (current == EXCITED) {
      // current = EXCITED;
      System.out.println("EXCITED");
    } else if (current == DIZZY) {
      System.out.println("DIZZY");
    } else {
      System.out.println("ERROR: non-exist state");
    }
  }

  void coffee() {
    System.out.println("Drink coffee");
    if (current == WAKEUP) {
      current = EXCITED;
      System.out.println("EXCITED");
    } else if (current == EXCITED) {
      System.out.println("EXCITED");
    } else if (current == DIZZY) {
      System.out.println("DIZZY");
    } else {
      System.out.println("ERROR: non-exist state");
    }
  }
}