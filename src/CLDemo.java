public class CLDemo {
    public static void main(String[] args) {
        System.out.println("Программе передано " + args.length + " аргументов командной строки.");
        for (int i =0; i < args.length; i++){
            System.out.println("arg[" + i + "]" + args[i]);
        }
    }
}
