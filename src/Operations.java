public class Operations {

    static int[] arr;

    //        4) Инициализировать массив псевдослучайными числами(Random)
    public void randArr() {

        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Main.random.nextInt(10);
            System.out.print(arr[i] + " ");
        }}

    //        5) Найти сумму и произведение всех элементов этого массива

        int sum = 0;
public void sum(){
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];

    }
    System.out.println("Сумма всех элементов массива : "+ sum);
        }
}



