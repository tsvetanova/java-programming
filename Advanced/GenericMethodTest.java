package Advanced;

class GenericMethodTest{

    public static <T> void printArray(T[] inputArray){
        for(T element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[]){
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        String[] stringArray = {"165", "2sdfg", "as3", "4#", "5244", "D6"};
        Double[] doubleArray = {1.5, 2.6, 3.3, 0.3, 5.6, .7};

        printArray(intArray);
        printArray(stringArray);
        printArray(doubleArray);
    }
}
