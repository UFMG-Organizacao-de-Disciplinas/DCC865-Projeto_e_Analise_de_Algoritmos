import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<int[]> inputDados = getInput();
        List<Integer> outputDados = inversao(inputDados);
        String formattedOutput = formatOutput(outputDados);
        System.out.println(formattedOutput);
    }

    public static List<int[]> getInput() {
        Scanner scanner = new Scanner(System.in);
        int quantTests = Integer.parseInt(scanner.nextLine().trim());
        List<int[]> dataInput = new ArrayList<>();

        for (int i = 0; i < quantTests; i++) {
            String[] parts = scanner.nextLine().trim().split(" ");
            int[] testCase = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();
            dataInput.add(testCase);
        }

        return dataInput;
    }

    public static List<Integer> inversao(List<int[]> inputDados) {
        List<Integer> results = new ArrayList<>();

        for (int[] testCase : inputDados) {
            results.add(getMinimumDepth(testCase));
        }

        return results;
    }

    public static int inverte(int valor) {
        int invertedValue = 0;
        while (valor > 0) {
            invertedValue = invertedValue * 10 + valor % 10;
            valor = valor / 10;
        }
        return invertedValue;
    }

    public static int soma(int valor) {
        return valor + 1;
    }

    public static void appendNewVisitor(Set<Integer> visitedValues, Queue<Integer> valuesToVisit, Queue<Integer> correspondingDepth, int visitingDepth, int newNodeValue) {
        if (!visitedValues.contains(newNodeValue) && !valuesToVisit.contains(newNodeValue)) {
            valuesToVisit.add(newNodeValue);
            correspondingDepth.add(visitingDepth + 1);
        }
    }

    public static int getMinimumDepth(int[] testCase) {
        int inputValue = testCase[0];
        Set<Integer> visitedValues = new HashSet<>();
        Queue<Integer> valuesToVisit = new LinkedList<>();
        Queue<Integer> correspondingDepth = new LinkedList<>();

        valuesToVisit.add(inputValue);
        correspondingDepth.add(0);

        int outputValue = testCase[1];
        int foundDepth = Integer.MAX_VALUE;

        while (!valuesToVisit.isEmpty()) {
            int visitingValue = valuesToVisit.poll();
            int visitingDepth = correspondingDepth.poll();

            if (outputValue == visitingValue) {
                foundDepth = visitingDepth;
                break;
            }

            visitedValues.add(visitingValue);

            appendNewVisitor(visitedValues, valuesToVisit, correspondingDepth, visitingDepth, inverte(visitingValue));
            appendNewVisitor(visitedValues, valuesToVisit, correspondingDepth, visitingDepth, soma(visitingValue));
        }

        return foundDepth;
    }

    public static String formatOutput(List<Integer> outputDados) {
        StringBuilder sb = new StringBuilder();
        for (int result : outputDados) {
            sb.append(result).append("\n");
        }
        sb.append("\n");
        return sb.toString();
    }
}