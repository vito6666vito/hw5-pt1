public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        int [] massiv = new int [3];
        massiv [0] = 1;
        massiv [1] = 2;
        massiv [2] = 3;

        double [] massiv1 = {1.57, 7.654, 9.986};

        short [] massiv2 = {123, 1234, 3254, 9888};

        System.out.println("задание 2");
        System.out.println(massiv[0] + "," + massiv[1] + "," + massiv[2]);
        System.out.println(massiv1[0] + "," + massiv1[1] + "," + massiv1[2]);
        System.out.println(massiv2[0] + "," + massiv2[1] + "," + massiv2[2] + "," + massiv2[3]);

        System.out.println("задание 3");
        System.out.println(massiv[2] + "," + massiv[1] + "," + massiv[0]);
        System.out.println(massiv1[2] + "," + massiv1[1] + "," + massiv1[0]);
        System.out.println(massiv2[3] + "," + massiv2[2] + "," + massiv2[1] + "," + massiv2[0]);

        System.out.println("задание 4");
        for (int i = 0; i < massiv.length; i++) {
            if(massiv[i]%2!=1){
                massiv[i]++;
            }
            System.out.println(massiv[i]);

        }


    }
}