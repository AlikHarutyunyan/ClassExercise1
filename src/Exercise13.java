public class Exercise13 {
    public static void main(String[] args) {
        char[] text1 = {'a', 'b', 'c', 'b'};
        char[] text2 = {'a', 'b', 'r'};
        char toFind = '5';
        System.out.println(toFind(text1, toFind));
        System.out.println(hasDuplicates(text1));
        char[] arrResult = replace(text1, 'b', 'G');
    }

    public static int toFind(char[] arr, char toFind){
        int result = -1;
        for(int i = 0; i<arr.length; i++){
            if(toFind == arr[i]){
                result = i;
            }
        }
        return result;
    }

    public static boolean hasDuplicates(char[] arr){
        boolean hasDuplicates = false;
        for(int i = 0; i<arr.length; i++) {
            for(int j =0; j <arr.length; j++){
                if(i != j && arr[i] == arr[j]){
                    hasDuplicates = true;
                    break;
                }
            }
        }
        return hasDuplicates;
    }

    public static char[] replace(char[] arr, char original, char replacement){
        char[] newArr = new char[arr.length];
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == original){
                newArr[i] = replacement;
                continue;
            }
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
