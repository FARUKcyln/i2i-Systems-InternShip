package springKafka.springKafkadocker;

public class Calculation {
    private int operand;
    private String operation;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getOperand() {
        return operand;
    }

    public void setOperand(int operand) {
        this.operand = operand;
    }

    @Override
    public String toString() {
        return "Calculation{" +
                "operand=" + operand +
                ", operation='" + operation + '\'' +
                '}';
    }
}
