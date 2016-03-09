package cw_one;

/**
 * This class ....
 *
 * Not working come back to this - unsure how to get to next label.
 *
 * @author Johnathan Yaari
 */

public class BnzInstruction extends Instruction {
    private int register;
    private int value;
    private String nextLabel;

    public BnzInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public BnzInstruction(String label, int register, String nextLabel) {
        super(label, "bnz");
        this.register = register;
        this.nextLabel = nextLabel;
    }

    @Override
    public void execute(Machine m) {
        if(m.getRegisters().getRegister(register) != 0) {
            m.getProg().stream().filter(ins -> ins.label.equals(nextLabel)).forEach(ins -> {
                int nextLabelId = m.getLabels().indexOf(nextLabel);
                m.setPc(nextLabelId);
            });
        }
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register + " value is " + value;
    }
}