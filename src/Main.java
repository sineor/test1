import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //1. Вывести на печать первый отрицательный элемент массива и его
        //порядковый номер, полагая, что в массиве есть хотя бы один отрицательный
        //элеменt
       /* int[] myArray = {5, 3, -8, 2, -1, 7};

        // Birinchi ters sandy chakyrabyz
        int[] result = findFirstNegative(myArray);

        // Rezultat
        System.out.println("Birinchi ters san: " + result[0]);
        System.out.println("katar nomer: " + result[1]);
    }

    public static int[] findFirstNegative(int[] arr) {
        int[] result = new int[2];  // Индекс 0: значение элемента, Индекс 1: порядковый номер

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                result[0] = arr[i];   // Значение отрицательного элемента
                result[1] = i + 1;    // Порядковый номер (индекс + 1)
                break;  // Прерываем цикл, так как нашли отрицательный элемент
            }
        }

        return result;*/
        //5. Определить является ли данная последовательность убывающей (во
        //избежание лишних проверок использовать оператор break)
       /* int[] sequence = {10, 8, 6, 4, 2};

        boolean isDecreasing = true;

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] >= sequence[i - 1]) {
                isDecreasing = false;
                break;
            }
        }

        if (isDecreasing) {
            System.out.println("Последовательность является убывающей.");
        } else {
            System.out.println("Последовательность не является убывающей.");
        }*/
        //6.Дан массив чисел. Определить, сколько в нем пар одинаковых
        //соседних элемentov
       /* int[] numbers = {1, 2, 2, 3, 4, 4, 4, 5, 6, 6};

        int count = countAdjacentPairs(numbers);

        System.out.println("Количество пар одинаковых соседних элементов: " + count);
    }

    public static int countAdjacentPairs(int[] arr) {
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            }
        }

        return count;*/
        //7.Дан   массив   чисел.   Найти   наибольший   элемент,   поставить   его
        //первым.
        /*int[] numbers = {5, 2, 9, 1, 7, 3};

        rearrangeMaxFirst(numbers);

        System.out.println("Массив после перемещения наибольшего элемента в начало:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void rearrangeMaxFirst(int[] arr) {
        int maxIndex = 0;

        // Находим индекс наибольшего элемента в массиве
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        // Перемещаем наибольший элемент в начало массива
        if (maxIndex != 0) {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[0];
            arr[0] = temp;
        }*/
        //8. Задан двумерный массив, содержащий 3 строки и 4 столбца. Найти
        //наибольший элемент, номер строки и столбца, в которых он расположен.
        /*int[][] matrix = {
                {12, 24, 7, 8},
                {3, 16, 22, 19},
                {5, 9, 13, 25}
        };

        int[] result = findMaxElement(matrix);

        int maxElement = result[0];
        int row = result[1];
        int col = result[2];

        System.out.println("Наибольший элемент: " + maxElement);
        System.out.println("Номер строки: " + row);
        System.out.println("Номер столбца: " + col);
    }

    public static int[] findMaxElement(int[][] arr) {
        int maxElement = arr[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxElement) {
                    maxElement = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        return new int[]{maxElement, maxRow, maxCol};*/
        //9.Составить программу для вычисления средних арифметических
        //значений положительных элементов каждого столбца двумерного массива,
        //содержащего 6 столбцов и три строки. При условии, что в каждом столбце
        //есть хотя бы один положительный элемент.
       /* int[][] matrix = {
                {3, -2, 7, 8, -4, 5},
                {-1, 6, -9, 2, 10, 12},
                {5, -3, 8, -6, 11, 9}
        };

        double[] averages = calculateAverages(matrix);

        for (int i = 0; i < averages.length; i++) {
            System.out.println("Среднее арифметическое значений в столбце " + i + ": " + averages[i]);
        }
    }

    public static double[] calculateAverages(int[][] arr) {
        int numRows = arr.length;
        int numCols = arr[0].length;
        double[] averages = new double[numCols];

        for (int j = 0; j < numCols; j++) {
            int sum = 0;
            int count = 0;

            for (int i = 0; i < numRows; i++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                    count++;
                }
            }

            averages[j] = (double) sum / count;
        }

        return averages;*/
        //11.Дана действительная квадратная матрица. Заменить нулями все
        //элементы, расположенные на главной диагонали и  выше нее
        /* int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        replaceAboveDiagonalWithZeros(matrix);

        System.out.println("Матрица после замены элементов выше главной диагонали нулями:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void replaceAboveDiagonalWithZeros(int[][] arr) {
        int n = arr.length;  // Размер матрицы

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = 0;  // Заменяем элементы выше главной диагонали нулями
            }
        }*/
        //// 12. Даны 8 действительных чисел х1, х2, ..., х8. Получить квадратную
        //        //матрицу 8х8
         /*double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8}; // Замените x1, x2, ... x8 на реальные значения

         double[][] matrix = new double[8][8];

        // Заполнение матрицы значениями
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = Math.pow(numbers[i], j + 1);
            }
        }

        // Вывод матрицы на экран
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }*/
        //13.  Дан   двумерный   массив,   содержащий   3   строки   и   4   столбца.
        //Упорядочить массив по убыванию элементов 3-ей строки.
       /* int[][] array = {
                {5, 9, 2, 7},
                {1, 6, 3, 8},
                {4, 0, 2, 5}
        };

        // Находим индексы элементов в 3-ей строке
        int[] indices = new int[array[2].length];
        for (int i = 0; i < array[2].length; i++) {
            indices[i] = i;
        }

        // Сортируем индексы по убыванию элементов 3-ей строки
        for (int i = 0; i < array[2].length - 1; i++) {
            for (int j = 0; j < array[2].length - i - 1; j++) {
                if (array[2][indices[j]] < array[2][indices[j + 1]]) {
                    // Обмен индексов
                    int temp = indices[j];
                    indices[j] = indices[j + 1];
                    indices[j + 1] = temp;
                }
            }
        }

        // Переупорядочиваем строки массива согласно новому порядку элементов 3-ей строки
        int[][] sortedArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sortedArray[i][j] = array[i][indices[j]];
            }
        }

        // Вывод отсортированного массива
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < sortedArray[i].length; j++) {
                System.out.print(sortedArray[i][j] + " ");
            }
            System.out.println();
        }*/
        //14.Дан двумерный массив, содержащий 5 строк и 2 столбца. Упорядочить
       // массив по возрастанию элементов 2-го столбц
       /* int[][] array = {
                {5, 9},
                {1, 6},
                {4, 0},
                {3, 2},
                {7, 8}
        };

        // Находим индексы элементов во 2-м столбце
        int[] indices = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            indices[i] = i;
        }

        // Сортируем индексы по возрастанию значений элементов 2-го столбца
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[indices[j]][1] > array[indices[j + 1]][1]) {
                    // Обмен индексов
                    int temp = indices[j];
                    indices[j] = indices[j + 1];
                    indices[j + 1] = temp;
                }
            }
        }

        // Переупорядочиваем строки массива согласно новому порядку индексов
        int[][] sortedArray = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[indices[i]].clone();
        }

        // Вывод отсортированного массива
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < sortedArray[i].length; j++) {
                System.out.print(sortedArray[i][j] + " ");
            }
            System.out.println();
        }*/
        //17.Найти   наибольший   элемент   главной   диагонали   матрицы   С
        //размером 4х4 и вывести на печать всю строку, в которой он находится
        /*int[][] matrix = {
                {5, 9, 2, 7},
                {1, 6, 3, 8},
                {4, 0, 2, 5},
                {3, 5, 9, 1}
        };

        int maxElement = matrix[0][0];
        int rowIndex = 0;

        // Находим наибольший элемент на главной диагонали и его индекс
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > maxElement) {
                maxElement = matrix[i][i];
                rowIndex = i;
            }
        }

        // Выводим строку, соответствующую найденному индексу
        System.out.println("Наибольший элемент на главной диагонали: " + maxElement);
        System.out.print("Строка с этим элементом: ");
        for (int j = 0; j < matrix[rowIndex].length; j++) {
            System.out.print(matrix[rowIndex][j] + " ");
        }*/
        // 19.Напишите код, который создает 20 случайных чисел диапазона
        //1 - 99. Следует вывести в консоль только те числа которые делятся на 1-
        //ое рандомное число без остатка
        /*Random random = new Random();
        int[] mass = new int[20];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(1,99);
            System.out.println(mass[i]);


        // Генерируем randomnyh chisel
        int divisor = random.nextInt(99) + 1;

        System.out.println("Birinchi random san: " + divisor);

        // divisorgo boluno turgan sandardy tuzobuz
        int count = 0;
        for ( i = 0; i < 20; i++) {
            int number = random.nextInt(99) + 1;
            if (number % divisor == 0) {
                System.out.println("Число " + number + " делится на " + divisor + " без остатка.");
                count++;
            }
        }

        System.out.println("Bardyk " + count + " kaldyksyz bolunuuchu " + divisor + " sandar.");
    }*/
        //Напишите код, который генерирует 20 рандомных целых чисел
        //из диапазона -50 до +50, и определяет наименьшее число и
        //наибольшее число. Нельзя использовать массив
       /* Random random = new Random();

        int minValue = Integer.MAX_VALUE; // Начальное значение для наименьшего числа
        int maxValue = Integer.MIN_VALUE; // Начальное значение для наибольшего числа

        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(-50,50) ; // Генерируем случайное число в диапазоне -50 до +50
            System.out.println("Сгенерированное число: " + randomNumber);

            // Обновляем наименьшее и наибольшее значения
            if (randomNumber < minValue) {
                minValue = randomNumber;
            }
            if (randomNumber > maxValue) {
                maxValue = randomNumber;
            }
        }

        System.out.println("E kichine san: " + minValue);
        System.out.println("En chon san: " + maxValue);*/
        // 22.Найти второй наибольший элемент в массиве
       /* int[] array = {25, 10, 47, 30, 15, 62, 5, 18};

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Второй наибольший элемент не найден.");
        } else {
            System.out.println("Второй наибольший элемент: " + secondLargest);
        }*/
        //23.Объединить два массива в третий массив:
       /* int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int length1 = array1.length;
        int length2 = array2.length;
        int length3 = length1 + length2;

        int[] array3 = new int[length3];

        // birinchi massivdegi elementterdi uchunchu massivge kochurobuz
        for (int i = 0; i < length1; i++) {
            array3[i] = array1[i];
        }

        // Копируем элементы из второго массива в третий
        for (int i = 0; i < length2; i++) {
            array3[length1 + i] = array2[i];
        }

        // Выводим объединенный массив
        for (int num : array3) {
            System.out.print(num + " ");
        }*/
       /* int[] originalArray = {1, 2, 3, 4, 5};
        int newValue = 6;

        // Создаем новый массив с увеличенной длиной
        int[] newArray = new int[originalArray.length + 1];

        // Копируем элементы из исходного массива в новый массив
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // Добавляем новый элемент в конец нового массива
        newArray[newArray.length - 1] = newValue;

        // Выводим новый массив
        System.out.println("Исходный массив: " + (originalArray));
        System.out.println("Новый массив с добавленным элементом: " + Arrays.toString(newArray));*/
    }
}











